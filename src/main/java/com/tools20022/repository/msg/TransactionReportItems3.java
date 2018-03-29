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
import com.tools20022.repository.area.tsmt.TransactionReportV03;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmTransactionIdentification
 * TransactionReportItems3.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmEstablishedBaselineIdentification
 * TransactionReportItems3.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmTransactionStatus
 * TransactionReportItems3.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmUserTransactionReference
 * TransactionReportItems3.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmPurchaseOrderReference
 * TransactionReportItems3.mmPurchaseOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmBuyer
 * TransactionReportItems3.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmSeller
 * TransactionReportItems3.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmBuyerBank
 * TransactionReportItems3.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmBuyerBankCountry
 * TransactionReportItems3.mmBuyerBankCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmSellerBank
 * TransactionReportItems3.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmSellerBankCountry
 * TransactionReportItems3.mmSellerBankCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmObligorBank
 * TransactionReportItems3.mmObligorBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmSubmittingBank
 * TransactionReportItems3.mmSubmittingBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmOutstandingAmount
 * TransactionReportItems3.mmOutstandingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmTotalNetAmount
 * TransactionReportItems3.mmTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3#mmPendingRequestForAction
 * TransactionReportItems3.mmPendingRequestForAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportV03#mmReportedItems
 * TransactionReportV03.mmReportedItems}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionReportItems3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed description of the items that correspond to the parameters set in a request and for which a report has been generated."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionReportItems3", propOrder = {"transactionIdentification", "establishedBaselineIdentification", "transactionStatus", "userTransactionReference", "purchaseOrderReference", "buyer", "seller", "buyerBank",
		"buyerBankCountry", "sellerBank", "sellerBankCountry", "obligorBank", "submittingBank", "outstandingAmount", "totalNetAmount", "pendingRequestForAction"})
public class TransactionReportItems3 {

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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReportItems3, Max35Text> mmTransactionIdentification = new MMMessageAttribute<TransactionReportItems3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransactionReportItems3 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "EstblishdBaselnId")
	protected DocumentIdentification3 establishedBaselineIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstblishdBaselnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstablishedBaselineIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the baseline when it is established."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReportItems3, Optional<DocumentIdentification3>> mmEstablishedBaselineIdentification = new MMMessageAssociationEnd<TransactionReportItems3, Optional<DocumentIdentification3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "EstblishdBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstablishedBaselineIdentification";
			definition = "Unique identification assigned by the matching application to the baseline when it is established.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentIdentification3.mmObject();
		}

		@Override
		public Optional<DocumentIdentification3> getValue(TransactionReportItems3 obj) {
			return obj.getEstablishedBaselineIdentification();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, Optional<DocumentIdentification3> value) {
			obj.setEstablishedBaselineIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TxSts", required = true)
	protected TransactionStatus4 transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionStatus4
	 * TransactionStatus4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAssociationEnd<TransactionReportItems3, TransactionStatus4> mmTransactionStatus = new MMMessageAssociationEnd<TransactionReportItems3, TransactionStatus4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Identifies the status of the transaction by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionStatus4.mmObject();
		}

		@Override
		public TransactionStatus4 getValue(TransactionReportItems3 obj) {
			return obj.getTransactionStatus();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, TransactionStatus4 value) {
			obj.setTransactionStatus(value);
		}
	};
	@XmlElement(name = "UsrTxRef")
	protected List<DocumentIdentification5> userTransactionReference;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAssociationEnd<TransactionReportItems3, List<DocumentIdentification5>> mmUserTransactionReference = new MMMessageAssociationEnd<TransactionReportItems3, List<DocumentIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "UsrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserTransactionReference";
			definition = "Reference to the transaction for each financial institution which is a party to the transaction.";
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentIdentification5.mmObject();
		}

		@Override
		public List<DocumentIdentification5> getValue(TransactionReportItems3 obj) {
			return obj.getUserTransactionReference();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, List<DocumentIdentification5> value) {
			obj.setUserTransactionReference(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAssociationEnd<TransactionReportItems3, DocumentIdentification7> mmPurchaseOrderReference = new MMMessageAssociationEnd<TransactionReportItems3, DocumentIdentification7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "PurchsOrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderReference";
			definition = "Reference to the purchase order of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification7.mmObject();
		}

		@Override
		public DocumentIdentification7 getValue(TransactionReportItems3 obj) {
			return obj.getPurchaseOrderReference();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, DocumentIdentification7 value) {
			obj.setPurchaseOrderReference(value);
		}
	};
	@XmlElement(name = "Buyr", required = true)
	protected PartyIdentification26 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAssociationEnd<TransactionReportItems3, PartyIdentification26> mmBuyer = new MMMessageAssociationEnd<TransactionReportItems3, PartyIdentification26>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public PartyIdentification26 getValue(TransactionReportItems3 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, PartyIdentification26 value) {
			obj.setBuyer(value);
		}
	};
	@XmlElement(name = "Sellr", required = true)
	protected PartyIdentification26 seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAssociationEnd<TransactionReportItems3, PartyIdentification26> mmSeller = new MMMessageAssociationEnd<TransactionReportItems3, PartyIdentification26>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification26.mmObject();
		}

		@Override
		public PartyIdentification26 getValue(TransactionReportItems3 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, PartyIdentification26 value) {
			obj.setSeller(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAssociationEnd<TransactionReportItems3, BICIdentification1> mmBuyerBank = new MMMessageAssociationEnd<TransactionReportItems3, BICIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "Financial institution of the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(TransactionReportItems3 obj) {
			return obj.getBuyerBank();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, BICIdentification1 value) {
			obj.setBuyerBank(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAttribute<TransactionReportItems3, CountryCode> mmBuyerBankCountry = new MMMessageAttribute<TransactionReportItems3, CountryCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "BuyrBkCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBankCountry";
			definition = "Country of the buyer bank.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(TransactionReportItems3 obj) {
			return obj.getBuyerBankCountry();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, CountryCode value) {
			obj.setBuyerBankCountry(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAssociationEnd<TransactionReportItems3, BICIdentification1> mmSellerBank = new MMMessageAssociationEnd<TransactionReportItems3, BICIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "Financial institution of the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(TransactionReportItems3 obj) {
			return obj.getSellerBank();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, BICIdentification1 value) {
			obj.setSellerBank(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAttribute<TransactionReportItems3, CountryCode> mmSellerBankCountry = new MMMessageAttribute<TransactionReportItems3, CountryCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "SellrBkCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBankCountry";
			definition = "Country of the seller bank.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(TransactionReportItems3 obj) {
			return obj.getSellerBankCountry();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, CountryCode value) {
			obj.setSellerBankCountry(value);
		}
	};
	@XmlElement(name = "OblgrBk")
	protected List<BICIdentification1> obligorBank;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligorBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that is an obligor bank to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReportItems3, List<BICIdentification1>> mmObligorBank = new MMMessageAssociationEnd<TransactionReportItems3, List<BICIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "OblgrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligorBank";
			definition = "Financial institution that is an obligor bank to the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public List<BICIdentification1> getValue(TransactionReportItems3 obj) {
			return obj.getObligorBank();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, List<BICIdentification1> value) {
			obj.setObligorBank(value);
		}
	};
	@XmlElement(name = "SubmitgBk")
	protected List<BICIdentification1> submittingBank;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitgBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittingBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that is a data set submitting bank to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReportItems3, List<BICIdentification1>> mmSubmittingBank = new MMMessageAssociationEnd<TransactionReportItems3, List<BICIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "SubmitgBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingBank";
			definition = "Financial institution that is a data set submitting bank to the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public List<BICIdentification1> getValue(TransactionReportItems3 obj) {
			return obj.getSubmittingBank();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, List<BICIdentification1> value) {
			obj.setSubmittingBank(value);
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAttribute<TransactionReportItems3, CurrencyAndAmount> mmOutstandingAmount = new MMMessageAttribute<TransactionReportItems3, CurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "OutsdngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingAmount";
			definition = "Amount of baseline not yet utilised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TransactionReportItems3 obj) {
			return obj.getOutstandingAmount();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, CurrencyAndAmount value) {
			obj.setOutstandingAmount(value);
		}
	};
	@XmlElement(name = "TtlNetAmt", required = true)
	protected CurrencyAndAmount totalNetAmount;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total net amount as specified in the baseline."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReportItems3, CurrencyAndAmount> mmTotalNetAmount = new MMMessageAttribute<TransactionReportItems3, CurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "TtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNetAmount";
			definition = "Total net amount as specified in the baseline.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TransactionReportItems3 obj) {
			return obj.getTotalNetAmount();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, CurrencyAndAmount value) {
			obj.setTotalNetAmount(value);
		}
	};
	@XmlElement(name = "PdgReqForActn")
	protected List<PendingActivity2> pendingRequestForAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PendingActivity2
	 * PendingActivity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportItems3
	 * TransactionReportItems3}</li>
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
	public static final MMMessageAssociationEnd<TransactionReportItems3, List<PendingActivity2>> mmPendingRequestForAction = new MMMessageAssociationEnd<TransactionReportItems3, List<PendingActivity2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportItems3.mmObject();
			isDerived = false;
			xmlTag = "PdgReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingRequestForAction";
			definition = "Next processing step required.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingActivity2.mmObject();
		}

		@Override
		public List<PendingActivity2> getValue(TransactionReportItems3 obj) {
			return obj.getPendingRequestForAction();
		}

		@Override
		public void setValue(TransactionReportItems3 obj, List<PendingActivity2> value) {
			obj.setPendingRequestForAction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReportItems3.mmTransactionIdentification, com.tools20022.repository.msg.TransactionReportItems3.mmEstablishedBaselineIdentification,
						com.tools20022.repository.msg.TransactionReportItems3.mmTransactionStatus, com.tools20022.repository.msg.TransactionReportItems3.mmUserTransactionReference,
						com.tools20022.repository.msg.TransactionReportItems3.mmPurchaseOrderReference, com.tools20022.repository.msg.TransactionReportItems3.mmBuyer, com.tools20022.repository.msg.TransactionReportItems3.mmSeller,
						com.tools20022.repository.msg.TransactionReportItems3.mmBuyerBank, com.tools20022.repository.msg.TransactionReportItems3.mmBuyerBankCountry, com.tools20022.repository.msg.TransactionReportItems3.mmSellerBank,
						com.tools20022.repository.msg.TransactionReportItems3.mmSellerBankCountry, com.tools20022.repository.msg.TransactionReportItems3.mmObligorBank, com.tools20022.repository.msg.TransactionReportItems3.mmSubmittingBank,
						com.tools20022.repository.msg.TransactionReportItems3.mmOutstandingAmount, com.tools20022.repository.msg.TransactionReportItems3.mmTotalNetAmount,
						com.tools20022.repository.msg.TransactionReportItems3.mmPendingRequestForAction);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransactionReportV03.mmReportedItems);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReportItems3";
				definition = "Detailed description of the items that correspond to the parameters set in a request and for which a report has been generated.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public TransactionReportItems3 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<DocumentIdentification3> getEstablishedBaselineIdentification() {
		return establishedBaselineIdentification == null ? Optional.empty() : Optional.of(establishedBaselineIdentification);
	}

	public TransactionReportItems3 setEstablishedBaselineIdentification(DocumentIdentification3 establishedBaselineIdentification) {
		this.establishedBaselineIdentification = establishedBaselineIdentification;
		return this;
	}

	public TransactionStatus4 getTransactionStatus() {
		return transactionStatus;
	}

	public TransactionReportItems3 setTransactionStatus(TransactionStatus4 transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference == null ? userTransactionReference = new ArrayList<>() : userTransactionReference;
	}

	public TransactionReportItems3 setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = Objects.requireNonNull(userTransactionReference);
		return this;
	}

	public DocumentIdentification7 getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public TransactionReportItems3 setPurchaseOrderReference(DocumentIdentification7 purchaseOrderReference) {
		this.purchaseOrderReference = Objects.requireNonNull(purchaseOrderReference);
		return this;
	}

	public PartyIdentification26 getBuyer() {
		return buyer;
	}

	public TransactionReportItems3 setBuyer(PartyIdentification26 buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public PartyIdentification26 getSeller() {
		return seller;
	}

	public TransactionReportItems3 setSeller(PartyIdentification26 seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public TransactionReportItems3 setBuyerBank(BICIdentification1 buyerBank) {
		this.buyerBank = Objects.requireNonNull(buyerBank);
		return this;
	}

	public CountryCode getBuyerBankCountry() {
		return buyerBankCountry;
	}

	public TransactionReportItems3 setBuyerBankCountry(CountryCode buyerBankCountry) {
		this.buyerBankCountry = Objects.requireNonNull(buyerBankCountry);
		return this;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public TransactionReportItems3 setSellerBank(BICIdentification1 sellerBank) {
		this.sellerBank = Objects.requireNonNull(sellerBank);
		return this;
	}

	public CountryCode getSellerBankCountry() {
		return sellerBankCountry;
	}

	public TransactionReportItems3 setSellerBankCountry(CountryCode sellerBankCountry) {
		this.sellerBankCountry = Objects.requireNonNull(sellerBankCountry);
		return this;
	}

	public List<BICIdentification1> getObligorBank() {
		return obligorBank == null ? obligorBank = new ArrayList<>() : obligorBank;
	}

	public TransactionReportItems3 setObligorBank(List<BICIdentification1> obligorBank) {
		this.obligorBank = Objects.requireNonNull(obligorBank);
		return this;
	}

	public List<BICIdentification1> getSubmittingBank() {
		return submittingBank == null ? submittingBank = new ArrayList<>() : submittingBank;
	}

	public TransactionReportItems3 setSubmittingBank(List<BICIdentification1> submittingBank) {
		this.submittingBank = Objects.requireNonNull(submittingBank);
		return this;
	}

	public CurrencyAndAmount getOutstandingAmount() {
		return outstandingAmount;
	}

	public TransactionReportItems3 setOutstandingAmount(CurrencyAndAmount outstandingAmount) {
		this.outstandingAmount = Objects.requireNonNull(outstandingAmount);
		return this;
	}

	public CurrencyAndAmount getTotalNetAmount() {
		return totalNetAmount;
	}

	public TransactionReportItems3 setTotalNetAmount(CurrencyAndAmount totalNetAmount) {
		this.totalNetAmount = Objects.requireNonNull(totalNetAmount);
		return this;
	}

	public List<PendingActivity2> getPendingRequestForAction() {
		return pendingRequestForAction == null ? pendingRequestForAction = new ArrayList<>() : pendingRequestForAction;
	}

	public TransactionReportItems3 setPendingRequestForAction(List<PendingActivity2> pendingRequestForAction) {
		this.pendingRequestForAction = Objects.requireNonNull(pendingRequestForAction);
		return this;
	}
}