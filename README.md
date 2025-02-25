# Samurai Travel

## 1. 使用技術
- **言語・フレームワークなど**
  - Java 21
  - Spring Boot 3.4.1
  - Thymeleaf
  - Spring Data JPA
  - Spring Security
  - Spring Boot Starter Mail

- **データベース**
  - MySQL (Connector/J)

- **その他ライブラリ**
  - Lombok
  - Stripe Java

- **ビルド・実行環境**
  - Maven
  - Spring Boot Maven Plugin


## 2. 実装機能
- **ユーザー管理機能**
  - ユーザー登録・ログイン・ログアウト
  - 管理者・一般ユーザーなどロールごとのアクセス制御

- **会員（ユーザー）向け機能**
  - 民宿一覧・詳細の閲覧
  - 民宿の予約（検索、日付指定、予約確認）
  - 予約の取り消しや変更
  - 決済機能（Stripe を利用）

- **民宿管理機能（CRUD）**
  - 民宿の新規登録／編集／更新／削除
  - 画像や詳細情報の管理
  - 管理者向け民宿一覧・ページネーション・絞り込み検索

- **検索／フィルタ機能**
  - キーワード検索（民宿名や住所など）
  - 並べ替え（料金や登録日など）
  - ページネーション

- **メール通知機能**
  - Mailtrap-Email
  - 新規会員登録時の確認メール送信
 
- **管理者向け機能**
  - 会員一覧・詳細・編集
  - 予約一覧・キャンセル処理

- **セキュリティ機能**
  - Spring Security を用いた認証・認可
  - ロール別のアクセス制限
  - フォーム入力時のバリデーション


## 3. Webアプリ
- **URL**
  - https://samurai-travel-minsyuku9-4b78e701c63c.herokuapp.com/
  - 管理者用のメールアドレス：hanako.samurai@example.com
  - 会員用のメールアドレス：taro.samurai@example.com
  - 共通のパスワード：password

- **要件定義書**
  - https://docs.google.com/document/d/1_1BNOOpfD2C4JC0J8HuxNLUXOdocVIABMNysaf-RdxI/edit?usp=drive_link
