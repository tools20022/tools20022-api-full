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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.choice.TradeMarket1Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.ExternalDocumentPurpose1Code;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GovernanceRules2;
import com.tools20022.repository.msg.QualifiedDocumentInformation1;
import com.tools20022.repository.msg.QualifiedPartyIdentification1;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Regroups identification parameters for trade items.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmIdentifier
 * FinancialItemParameters1.mmIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmIssueDate
 * FinancialItemParameters1.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmRelatedItem
 * FinancialItemParameters1.mmRelatedItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmDocumentPurpose
 * FinancialItemParameters1.mmDocumentPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmLanguageCode
 * FinancialItemParameters1.mmLanguageCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmIssuer
 * FinancialItemParameters1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmRecipient
 * FinancialItemParameters1.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmBuyer
 * FinancialItemParameters1.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmSeller
 * FinancialItemParameters1.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmSellerFinancialAgent
 * FinancialItemParameters1.mmSellerFinancialAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmBuyerFinancialAgent
 * FinancialItemParameters1.mmBuyerFinancialAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmGoverningContract
 * FinancialItemParameters1.mmGoverningContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmLegalContext
 * FinancialItemParameters1.mmLegalContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmCurrency
 * FinancialItemParameters1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmDebitAccount
 * FinancialItemParameters1.mmDebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmCreditAccount
 * FinancialItemParameters1.mmCreditAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmTradeMarket
 * FinancialItemParameters1.mmTradeMarket}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialItemParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Regroups identification parameters for trade items."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialItemParameters1", propOrder = {"identifier", "issueDate", "relatedItem", "documentPurpose", "languageCode", "issuer", "recipient", "buyer", "seller", "sellerFinancialAgent", "buyerFinancialAgent",
		"governingContract", "legalContext", "currency", "debitAccount", "creditAccount", "tradeMarket"})
public class FinancialItemParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Idr", required = true)
	protected Max35Text identifier;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmIdentification
	 * InvoiceFinancingAgreement.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Idr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of this item relative to the issuing party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialItemParameters1, Max35Text> mmIdentifier = new MMMessageAttribute<FinancialItemParameters1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "Idr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identifier";
			definition = "Unique identification of this item relative to the issuing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(FinancialItemParameters1 obj) {
			return obj.getIdentifier();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Max35Text value) {
			obj.setIdentifier(value);
		}
	};
	@XmlElement(name = "IsseDt", required = true)
	protected ISODate issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of creation of the item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialItemParameters1, ISODate> mmIssueDate = new MMMessageAttribute<FinancialItemParameters1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date of creation of the item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(FinancialItemParameters1 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, ISODate value) {
			obj.setIssueDate(value);
		}
	};
	@XmlElement(name = "RltdItm")
	protected List<QualifiedDocumentInformation1> relatedItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdItm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of related items, for example an assignment or an advice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, List<QualifiedDocumentInformation1>> mmRelatedItem = new MMMessageAssociationEnd<FinancialItemParameters1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "RltdItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedItem";
			definition = "Identifier of related items, for example an assignment or an advice.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(FinancialItemParameters1 obj) {
			return obj.getRelatedItem();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setRelatedItem(value);
		}
	};
	@XmlElement(name = "DocPurp")
	protected ExternalDocumentPurpose1Code documentPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentPurpose1Code
	 * ExternalDocumentPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPurpose
	 * Document.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocPurp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the function of the document related to the item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialItemParameters1, Optional<ExternalDocumentPurpose1Code>> mmDocumentPurpose = new MMMessageAttribute<FinancialItemParameters1, Optional<ExternalDocumentPurpose1Code>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "DocPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentPurpose";
			definition = "Specifies the function of the document related to the item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalDocumentPurpose1Code.mmObject();
		}

		@Override
		public Optional<ExternalDocumentPurpose1Code> getValue(FinancialItemParameters1 obj) {
			return obj.getDocumentPurpose();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<ExternalDocumentPurpose1Code> value) {
			obj.setDocumentPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "LangCd")
	protected LanguageCode languageCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmLanguage
	 * Document.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LangCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LanguageCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language used for textual information in item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialItemParameters1, Optional<LanguageCode>> mmLanguageCode = new MMMessageAttribute<FinancialItemParameters1, Optional<LanguageCode>>() {
		{
			businessElementTrace_lazy = () -> Document.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "LangCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LanguageCode";
			definition = "Language used for textual information in item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(FinancialItemParameters1 obj) {
			return obj.getLanguageCode();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<LanguageCode> value) {
			obj.setLanguageCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Issr")
	protected QualifiedPartyIdentification1 issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that issued this list of items."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>> mmIssuer = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party that issued this list of items.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public Optional<QualifiedPartyIdentification1> getValue(FinancialItemParameters1 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<QualifiedPartyIdentification1> value) {
			obj.setIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcpt")
	protected QualifiedPartyIdentification1 recipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiving party of this list of items."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>> mmRecipient = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Receiving party of this list of items.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public Optional<QualifiedPartyIdentification1> getValue(FinancialItemParameters1 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<QualifiedPartyIdentification1> value) {
			obj.setRecipient(value.orElse(null));
		}
	};
	@XmlElement(name = "Buyr")
	protected QualifiedPartyIdentification1 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts as buyer of the goods or services referred to by the financial item."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>> mmBuyer = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that acts as buyer of the goods or services referred to by the financial item.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public Optional<QualifiedPartyIdentification1> getValue(FinancialItemParameters1 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<QualifiedPartyIdentification1> value) {
			obj.setBuyer(value.orElse(null));
		}
	};
	@XmlElement(name = "Sellr")
	protected QualifiedPartyIdentification1 seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts as seller of the goods or services referred to by the financial item."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>> mmSeller = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that acts as seller of the goods or services referred to by the financial item.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public Optional<QualifiedPartyIdentification1> getValue(FinancialItemParameters1 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<QualifiedPartyIdentification1> value) {
			obj.setSeller(value.orElse(null));
		}
	};
	@XmlElement(name = "SellrFinAgt")
	protected QualifiedPartyIdentification1 sellerFinancialAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrFinAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerFinancialAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial agent for the seller."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>> mmSellerFinancialAgent = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "SellrFinAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerFinancialAgent";
			definition = "Financial agent for the seller.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public Optional<QualifiedPartyIdentification1> getValue(FinancialItemParameters1 obj) {
			return obj.getSellerFinancialAgent();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<QualifiedPartyIdentification1> value) {
			obj.setSellerFinancialAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "BuyrFinAgt")
	protected QualifiedPartyIdentification1 buyerFinancialAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrFinAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerFinancialAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial agent for the buyer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>> mmBuyerFinancialAgent = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<QualifiedPartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "BuyrFinAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerFinancialAgent";
			definition = "Financial agent for the buyer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public Optional<QualifiedPartyIdentification1> getValue(FinancialItemParameters1 obj) {
			return obj.getBuyerFinancialAgent();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<QualifiedPartyIdentification1> value) {
			obj.setBuyerFinancialAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "GovngCtrct")
	protected List<QualifiedDocumentInformation1> governingContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAgreement
	 * Document.mmAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GovngCtrct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to contract that governs the exchange of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, List<QualifiedDocumentInformation1>> mmGoverningContract = new MMMessageAssociationEnd<FinancialItemParameters1, List<QualifiedDocumentInformation1>>() {
		{
			businessElementTrace_lazy = () -> Document.mmAgreement;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "GovngCtrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoverningContract";
			definition = "Reference to contract that governs the exchange of the message.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(FinancialItemParameters1 obj) {
			return obj.getGoverningContract();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setGoverningContract(value);
		}
	};
	@XmlElement(name = "LglCntxt")
	protected GovernanceRules2 legalContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GovernanceRules2
	 * GovernanceRules2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmGovernanceRules
	 * Jurisdiction.mmGovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglCntxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rules and laws governing the item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<GovernanceRules2>> mmLegalContext = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<GovernanceRules2>>() {
		{
			businessElementTrace_lazy = () -> Jurisdiction.mmGovernanceRules;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "LglCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalContext";
			definition = "Rules and laws governing the item.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> GovernanceRules2.mmObject();
		}

		@Override
		public Optional<GovernanceRules2> getValue(FinancialItemParameters1 obj) {
			return obj.getLegalContext();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<GovernanceRules2> value) {
			obj.setLegalContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceCurrency
	 * Invoice.mmInvoiceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialItemParameters1, Optional<CurrencyCode>> mmCurrency = new MMMessageAttribute<FinancialItemParameters1, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmInvoiceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(FinancialItemParameters1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<CurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtAcct")
	protected AccountIdentification4Choice debitAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the account debited for charges (or credited for reimbursement)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<AccountIdentification4Choice>> mmDebitAccount = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<AccountIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "DbtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAccount";
			definition = "Defines the account debited for charges (or credited for reimbursement).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification4Choice> getValue(FinancialItemParameters1 obj) {
			return obj.getDebitAccount();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<AccountIdentification4Choice> value) {
			obj.setDebitAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtAcct")
	protected AccountIdentification4Choice creditAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the account credited for charges (or debited for reimbursement)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<AccountIdentification4Choice>> mmCreditAccount = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<AccountIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "CdtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccount";
			definition = "Defines the account credited for charges (or debited for reimbursement).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification4Choice> getValue(FinancialItemParameters1 obj) {
			return obj.getCreditAccount();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<AccountIdentification4Choice> value) {
			obj.setCreditAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "TradMkt")
	protected TradeMarket1Choice tradeMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.TradeMarket1Choice
	 * TradeMarket1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmMarket
	 * Trade.mmMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1
	 * FinancialItemParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradMkt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the geographical environment of the trade market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialItemParameters1, Optional<TradeMarket1Choice>> mmTradeMarket = new MMMessageAssociationEnd<FinancialItemParameters1, Optional<TradeMarket1Choice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialItemParameters1.mmObject();
			isDerived = false;
			xmlTag = "TradMkt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeMarket";
			definition = "Identification of the geographical environment of the trade market.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeMarket1Choice.mmObject();
		}

		@Override
		public Optional<TradeMarket1Choice> getValue(FinancialItemParameters1 obj) {
			return obj.getTradeMarket();
		}

		@Override
		public void setValue(FinancialItemParameters1 obj, Optional<TradeMarket1Choice> value) {
			obj.setTradeMarket(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialItemParameters1.mmIdentifier, com.tools20022.repository.msg.FinancialItemParameters1.mmIssueDate,
						com.tools20022.repository.msg.FinancialItemParameters1.mmRelatedItem, com.tools20022.repository.msg.FinancialItemParameters1.mmDocumentPurpose, com.tools20022.repository.msg.FinancialItemParameters1.mmLanguageCode,
						com.tools20022.repository.msg.FinancialItemParameters1.mmIssuer, com.tools20022.repository.msg.FinancialItemParameters1.mmRecipient, com.tools20022.repository.msg.FinancialItemParameters1.mmBuyer,
						com.tools20022.repository.msg.FinancialItemParameters1.mmSeller, com.tools20022.repository.msg.FinancialItemParameters1.mmSellerFinancialAgent,
						com.tools20022.repository.msg.FinancialItemParameters1.mmBuyerFinancialAgent, com.tools20022.repository.msg.FinancialItemParameters1.mmGoverningContract,
						com.tools20022.repository.msg.FinancialItemParameters1.mmLegalContext, com.tools20022.repository.msg.FinancialItemParameters1.mmCurrency, com.tools20022.repository.msg.FinancialItemParameters1.mmDebitAccount,
						com.tools20022.repository.msg.FinancialItemParameters1.mmCreditAccount, com.tools20022.repository.msg.FinancialItemParameters1.mmTradeMarket);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FinancialItemParameters1";
				definition = "Regroups identification parameters for trade items.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentifier() {
		return identifier;
	}

	public FinancialItemParameters1 setIdentifier(Max35Text identifier) {
		this.identifier = Objects.requireNonNull(identifier);
		return this;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public FinancialItemParameters1 setIssueDate(ISODate issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public List<QualifiedDocumentInformation1> getRelatedItem() {
		return relatedItem == null ? relatedItem = new ArrayList<>() : relatedItem;
	}

	public FinancialItemParameters1 setRelatedItem(List<QualifiedDocumentInformation1> relatedItem) {
		this.relatedItem = Objects.requireNonNull(relatedItem);
		return this;
	}

	public Optional<ExternalDocumentPurpose1Code> getDocumentPurpose() {
		return documentPurpose == null ? Optional.empty() : Optional.of(documentPurpose);
	}

	public FinancialItemParameters1 setDocumentPurpose(ExternalDocumentPurpose1Code documentPurpose) {
		this.documentPurpose = documentPurpose;
		return this;
	}

	public Optional<LanguageCode> getLanguageCode() {
		return languageCode == null ? Optional.empty() : Optional.of(languageCode);
	}

	public FinancialItemParameters1 setLanguageCode(LanguageCode languageCode) {
		this.languageCode = languageCode;
		return this;
	}

	public Optional<QualifiedPartyIdentification1> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public FinancialItemParameters1 setIssuer(QualifiedPartyIdentification1 issuer) {
		this.issuer = issuer;
		return this;
	}

	public Optional<QualifiedPartyIdentification1> getRecipient() {
		return recipient == null ? Optional.empty() : Optional.of(recipient);
	}

	public FinancialItemParameters1 setRecipient(QualifiedPartyIdentification1 recipient) {
		this.recipient = recipient;
		return this;
	}

	public Optional<QualifiedPartyIdentification1> getBuyer() {
		return buyer == null ? Optional.empty() : Optional.of(buyer);
	}

	public FinancialItemParameters1 setBuyer(QualifiedPartyIdentification1 buyer) {
		this.buyer = buyer;
		return this;
	}

	public Optional<QualifiedPartyIdentification1> getSeller() {
		return seller == null ? Optional.empty() : Optional.of(seller);
	}

	public FinancialItemParameters1 setSeller(QualifiedPartyIdentification1 seller) {
		this.seller = seller;
		return this;
	}

	public Optional<QualifiedPartyIdentification1> getSellerFinancialAgent() {
		return sellerFinancialAgent == null ? Optional.empty() : Optional.of(sellerFinancialAgent);
	}

	public FinancialItemParameters1 setSellerFinancialAgent(QualifiedPartyIdentification1 sellerFinancialAgent) {
		this.sellerFinancialAgent = sellerFinancialAgent;
		return this;
	}

	public Optional<QualifiedPartyIdentification1> getBuyerFinancialAgent() {
		return buyerFinancialAgent == null ? Optional.empty() : Optional.of(buyerFinancialAgent);
	}

	public FinancialItemParameters1 setBuyerFinancialAgent(QualifiedPartyIdentification1 buyerFinancialAgent) {
		this.buyerFinancialAgent = buyerFinancialAgent;
		return this;
	}

	public List<QualifiedDocumentInformation1> getGoverningContract() {
		return governingContract == null ? governingContract = new ArrayList<>() : governingContract;
	}

	public FinancialItemParameters1 setGoverningContract(List<QualifiedDocumentInformation1> governingContract) {
		this.governingContract = Objects.requireNonNull(governingContract);
		return this;
	}

	public Optional<GovernanceRules2> getLegalContext() {
		return legalContext == null ? Optional.empty() : Optional.of(legalContext);
	}

	public FinancialItemParameters1 setLegalContext(GovernanceRules2 legalContext) {
		this.legalContext = legalContext;
		return this;
	}

	public Optional<CurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public FinancialItemParameters1 setCurrency(CurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<AccountIdentification4Choice> getDebitAccount() {
		return debitAccount == null ? Optional.empty() : Optional.of(debitAccount);
	}

	public FinancialItemParameters1 setDebitAccount(AccountIdentification4Choice debitAccount) {
		this.debitAccount = debitAccount;
		return this;
	}

	public Optional<AccountIdentification4Choice> getCreditAccount() {
		return creditAccount == null ? Optional.empty() : Optional.of(creditAccount);
	}

	public FinancialItemParameters1 setCreditAccount(AccountIdentification4Choice creditAccount) {
		this.creditAccount = creditAccount;
		return this;
	}

	public Optional<TradeMarket1Choice> getTradeMarket() {
		return tradeMarket == null ? Optional.empty() : Optional.of(tradeMarket);
	}

	public FinancialItemParameters1 setTradeMarket(TradeMarket1Choice tradeMarket) {
		this.tradeMarket = tradeMarket;
		return this;
	}
}