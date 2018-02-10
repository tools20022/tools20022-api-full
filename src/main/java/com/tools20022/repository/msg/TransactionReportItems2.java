/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Detailed description of the items that correspond to the parameters set in a
 * request and for which a report has been generated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmTransactionIdentification
 * TransactionReportItems2.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmTSUBaselineIdentification
 * TransactionReportItems2.mmTSUBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmTransactionStatus
 * TransactionReportItems2.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmUserTransactionReference
 * TransactionReportItems2.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmPurchaseOrderReference
 * TransactionReportItems2.mmPurchaseOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmBuyer
 * TransactionReportItems2.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmSeller
 * TransactionReportItems2.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmBuyerBank
 * TransactionReportItems2.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmBuyerBankCountry
 * TransactionReportItems2.mmBuyerBankCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmSellerBank
 * TransactionReportItems2.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmSellerBankCountry
 * TransactionReportItems2.mmSellerBankCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmOutstandingAmount
 * TransactionReportItems2.mmOutstandingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2#mmPendingRequestForAction
 * TransactionReportItems2.mmPendingRequestForAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionReportItems2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed description of the items that correspond to the parameters set in a request and for which a report has been generated."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionReportItems2", propOrder = {"transactionIdentification", "tSUBaselineIdentification", "transactionStatus", "userTransactionReference", "purchaseOrderReference", "buyer", "seller", "buyerBank",
		"buyerBankCountry", "sellerBank", "sellerBankCountry", "outstandingAmount", "pendingRequestForAction"})
public class TransactionReportItems2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the TSU to the transaction.\nThis identification is to be used in any communication between the parties and with the TSU."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the TSU to the transaction.\nThis identification is to be used in any communication between the parties and with the TSU.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TSUBaselnId")
	protected DocumentIdentification3 tSUBaselineIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3
	 * DocumentIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TSUBaselnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TSUBaselineIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique Identification assigned by the TSU to the baseline included in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTSUBaselineIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "TSUBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TSUBaselineIdentification";
			definition = "Unique Identification assigned by the TSU to the baseline included in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification3.mmObject();
		}
	};
	@XmlElement(name = "TxSts", required = true)
	protected TransactionStatus1 transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionStatus1
	 * TransactionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the status of the transaction by means of a code."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Identifies the status of the transaction by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionStatus1.mmObject();
		}
	};
	@XmlElement(name = "UsrTxRef", required = true)
	protected List<com.tools20022.repository.msg.DocumentIdentification5> userTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5
	 * DocumentIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for each financial institution which is a party to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUserTransactionReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "UsrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserTransactionReference";
			definition = "Reference to the transaction for each financial institution which is a party to the transaction.";
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification5.mmObject();
		}
	};
	@XmlElement(name = "PurchsOrdrRef", required = true)
	protected DocumentIdentification7 purchaseOrderReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurchsOrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the purchase order of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurchaseOrderReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "PurchsOrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderReference";
			definition = "Reference to the purchase order of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification7.mmObject();
		}
	};
	@XmlElement(name = "Buyr", required = true)
	protected PartyIdentification9 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification9
	 * PartyIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification9.mmObject();
		}
	};
	@XmlElement(name = "Sellr", required = true)
	protected PartyIdentification9 seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification9
	 * PartyIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSeller = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification9.mmObject();
		}
	};
	@XmlElement(name = "BuyrBk", required = true)
	protected BICIdentification1 buyerBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial institution of the buyer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyerBank = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "Financial institution of the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	@XmlElement(name = "BuyrBkCtry", required = true)
	protected CountryCode buyerBankCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBkCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBankCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the buyer bank."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuyerBankCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "BuyrBkCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBankCountry";
			definition = "Country of the buyer bank.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "SellrBk", required = true)
	protected BICIdentification1 sellerBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial institution of the seller."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellerBank = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "Financial institution of the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	@XmlElement(name = "SellrBkCtry", required = true)
	protected CountryCode sellerBankCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBkCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBankCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the seller bank."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSellerBankCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "SellrBkCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBankCountry";
			definition = "Country of the seller bank.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "OutsdngAmt", required = true)
	protected CurrencyAndAmount outstandingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutsdngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of baseline not yet utilised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutstandingAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "OutsdngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingAmount";
			definition = "Amount of baseline not yet utilised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "PdgReqForActn")
	protected List<com.tools20022.repository.msg.PendingActivity1> pendingRequestForAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PendingActivity1
	 * PendingActivity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems2
	 * TransactionReportItems2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgReqForActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingRequestForAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Next processing step required."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingRequestForAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems2.mmObject();
			isDerived = false;
			xmlTag = "PdgReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingRequestForAction";
			definition = "Next processing step required.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PendingActivity1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReportItems2.mmTransactionIdentification, com.tools20022.repository.msg.TransactionReportItems2.mmTSUBaselineIdentification,
						com.tools20022.repository.msg.TransactionReportItems2.mmTransactionStatus, com.tools20022.repository.msg.TransactionReportItems2.mmUserTransactionReference,
						com.tools20022.repository.msg.TransactionReportItems2.mmPurchaseOrderReference, com.tools20022.repository.msg.TransactionReportItems2.mmBuyer, com.tools20022.repository.msg.TransactionReportItems2.mmSeller,
						com.tools20022.repository.msg.TransactionReportItems2.mmBuyerBank, com.tools20022.repository.msg.TransactionReportItems2.mmBuyerBankCountry, com.tools20022.repository.msg.TransactionReportItems2.mmSellerBank,
						com.tools20022.repository.msg.TransactionReportItems2.mmSellerBankCountry, com.tools20022.repository.msg.TransactionReportItems2.mmOutstandingAmount,
						com.tools20022.repository.msg.TransactionReportItems2.mmPendingRequestForAction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionReportItems2";
				definition = "Detailed description of the items that correspond to the parameters set in a request and for which a report has been generated.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public TransactionReportItems2 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<DocumentIdentification3> getTSUBaselineIdentification() {
		return tSUBaselineIdentification == null ? Optional.empty() : Optional.of(tSUBaselineIdentification);
	}

	public TransactionReportItems2 setTSUBaselineIdentification(com.tools20022.repository.msg.DocumentIdentification3 tSUBaselineIdentification) {
		this.tSUBaselineIdentification = tSUBaselineIdentification;
		return this;
	}

	public TransactionStatus1 getTransactionStatus() {
		return transactionStatus;
	}

	public TransactionReportItems2 setTransactionStatus(com.tools20022.repository.msg.TransactionStatus1 transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference == null ? userTransactionReference = new ArrayList<>() : userTransactionReference;
	}

	public TransactionReportItems2 setUserTransactionReference(List<com.tools20022.repository.msg.DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = Objects.requireNonNull(userTransactionReference);
		return this;
	}

	public DocumentIdentification7 getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public TransactionReportItems2 setPurchaseOrderReference(com.tools20022.repository.msg.DocumentIdentification7 purchaseOrderReference) {
		this.purchaseOrderReference = Objects.requireNonNull(purchaseOrderReference);
		return this;
	}

	public PartyIdentification9 getBuyer() {
		return buyer;
	}

	public TransactionReportItems2 setBuyer(com.tools20022.repository.msg.PartyIdentification9 buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public PartyIdentification9 getSeller() {
		return seller;
	}

	public TransactionReportItems2 setSeller(com.tools20022.repository.msg.PartyIdentification9 seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public TransactionReportItems2 setBuyerBank(com.tools20022.repository.msg.BICIdentification1 buyerBank) {
		this.buyerBank = Objects.requireNonNull(buyerBank);
		return this;
	}

	public CountryCode getBuyerBankCountry() {
		return buyerBankCountry;
	}

	public TransactionReportItems2 setBuyerBankCountry(CountryCode buyerBankCountry) {
		this.buyerBankCountry = Objects.requireNonNull(buyerBankCountry);
		return this;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public TransactionReportItems2 setSellerBank(com.tools20022.repository.msg.BICIdentification1 sellerBank) {
		this.sellerBank = Objects.requireNonNull(sellerBank);
		return this;
	}

	public CountryCode getSellerBankCountry() {
		return sellerBankCountry;
	}

	public TransactionReportItems2 setSellerBankCountry(CountryCode sellerBankCountry) {
		this.sellerBankCountry = Objects.requireNonNull(sellerBankCountry);
		return this;
	}

	public CurrencyAndAmount getOutstandingAmount() {
		return outstandingAmount;
	}

	public TransactionReportItems2 setOutstandingAmount(CurrencyAndAmount outstandingAmount) {
		this.outstandingAmount = Objects.requireNonNull(outstandingAmount);
		return this;
	}

	public List<PendingActivity1> getPendingRequestForAction() {
		return pendingRequestForAction == null ? pendingRequestForAction = new ArrayList<>() : pendingRequestForAction;
	}

	public TransactionReportItems2 setPendingRequestForAction(List<com.tools20022.repository.msg.PendingActivity1> pendingRequestForAction) {
		this.pendingRequestForAction = Objects.requireNonNull(pendingRequestForAction);
		return this;
	}
}