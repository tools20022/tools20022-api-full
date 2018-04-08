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
import com.tools20022.repository.codeset.ExternalDocumentType1Code;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification116;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics shared by all individual transactions included in the
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader69#mmIdentification
 * GroupHeader69.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader69#mmIssuedDate
 * GroupHeader69.mmIssuedDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader69#mmReportCategory
 * GroupHeader69.mmReportCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader69#mmTaxReportPurpose
 * GroupHeader69.mmTaxReportPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader69#mmOriginalIdentification
 * GroupHeader69.mmOriginalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader69#mmSellerTaxRepresentative
 * GroupHeader69.mmSellerTaxRepresentative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader69#mmBuyerTaxRepresentative
 * GroupHeader69.mmBuyerTaxRepresentative}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader69#mmLanguageCode
 * GroupHeader69.mmLanguageCode}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "GroupHeader69"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics shared by all individual transactions included in the message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.GroupHeader12
 * GroupHeader12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GroupHeader69", propOrder = {"identification", "issuedDate", "reportCategory", "taxReportPurpose", "originalIdentification", "sellerTaxRepresentative", "buyerTaxRepresentative", "languageCode"})
public class GroupHeader69 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report identification, for example invoice number or report number from point of sales system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader12#mmMessageIdentification
	 * GroupHeader12.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader69, Max35Text> mmIdentification = new MMMessageAttribute<GroupHeader69, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Report identification, for example invoice number or report number from point of sales system.";
			previousVersion_lazy = () -> GroupHeader12.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(GroupHeader69 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(GroupHeader69 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "IssdDt", required = true)
	protected ISODate issuedDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the status report was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader12#mmCreationDateTime
	 * GroupHeader12.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader69, ISODate> mmIssuedDate = new MMMessageAttribute<GroupHeader69, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "IssdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuedDate";
			definition = "Date at which the status report was created.";
			previousVersion_lazy = () -> GroupHeader12.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(GroupHeader69 obj) {
			return obj.getIssuedDate();
		}

		@Override
		public void setValue(GroupHeader69 obj, ISODate value) {
			obj.setIssuedDate(value);
		}
	};
	@XmlElement(name = "RptCtgy", required = true)
	protected ExternalDocumentType1Code reportCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentType1Code
	 * ExternalDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
	 * constraint} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintR3#forGroupHeader69_ReportCategory
	 * ConstraintR3.forGroupHeader69_ReportCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the report is based on debit invoice, credit invoice, card transaction or cash transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader69, ExternalDocumentType1Code> mmReportCategory = new MMMessageAttribute<GroupHeader69, ExternalDocumentType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "RptCtgy";
			constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintR3.forGroupHeader69_ReportCategory);
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportCategory";
			definition = "Specifies if the report is based on debit invoice, credit invoice, card transaction or cash transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}

		@Override
		public ExternalDocumentType1Code getValue(GroupHeader69 obj) {
			return obj.getReportCategory();
		}

		@Override
		public void setValue(GroupHeader69 obj, ExternalDocumentType1Code value) {
			obj.setReportCategory(value);
		}
	};
	@XmlElement(name = "TaxRptPurp", required = true)
	protected ExternalDocumentType1Code taxReportPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentType1Code
	 * ExternalDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRptPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
	 * constraint} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintR4#forGroupHeader69_TaxReportPurpose
	 * ConstraintR4.forGroupHeader69_TaxReportPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReportPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if the TaxReport is new, correction or remove."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader69, ExternalDocumentType1Code> mmTaxReportPurpose = new MMMessageAttribute<GroupHeader69, ExternalDocumentType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "TaxRptPurp";
			constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintR4.forGroupHeader69_TaxReportPurpose);
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReportPurpose";
			definition = "Specifies if the TaxReport is new, correction or remove.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}

		@Override
		public ExternalDocumentType1Code getValue(GroupHeader69 obj) {
			return obj.getTaxReportPurpose();
		}

		@Override
		public void setValue(GroupHeader69 obj, ExternalDocumentType1Code value) {
			obj.setTaxReportPurpose(value);
		}
	};
	@XmlElement(name = "OrgnlId")
	protected Max35Text originalIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original tax report identification, used for example original invoice number with credit notes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader69, Optional<Max35Text>> mmOriginalIdentification = new MMMessageAttribute<GroupHeader69, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "OrgnlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIdentification";
			definition = "Original tax report identification, used for example original invoice number with credit notes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(GroupHeader69 obj) {
			return obj.getOriginalIdentification();
		}

		@Override
		public void setValue(GroupHeader69 obj, Optional<Max35Text> value) {
			obj.setOriginalIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SellrTaxRprtv")
	protected PartyIdentification116 sellerTaxRepresentative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification116
	 * PartyIdentification116}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrTaxRprtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerTaxRepresentative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of tax representative. The corporate (seller) is allowed to use a tax representative for value added tax responsibilities in case the seller is not registered in a specific value added tax registry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader69, Optional<PartyIdentification116>> mmSellerTaxRepresentative = new MMMessageAssociationEnd<GroupHeader69, Optional<PartyIdentification116>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "SellrTaxRprtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerTaxRepresentative";
			definition = "Details of tax representative. The corporate (seller) is allowed to use a tax representative for value added tax responsibilities in case the seller is not registered in a specific value added tax registry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification116.mmObject();
		}

		@Override
		public Optional<PartyIdentification116> getValue(GroupHeader69 obj) {
			return obj.getSellerTaxRepresentative();
		}

		@Override
		public void setValue(GroupHeader69 obj, Optional<PartyIdentification116> value) {
			obj.setSellerTaxRepresentative(value.orElse(null));
		}
	};
	@XmlElement(name = "BuyrTaxRprtv")
	protected PartyIdentification116 buyerTaxRepresentative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification116
	 * PartyIdentification116}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrTaxRprtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerTaxRepresentative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of tax representative. The corporate (buyer) is allowed to use a tax representative for value added tax responsibilities in case the buyer is not registered in a specific value added tax registry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader69, Optional<PartyIdentification116>> mmBuyerTaxRepresentative = new MMMessageAssociationEnd<GroupHeader69, Optional<PartyIdentification116>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "BuyrTaxRprtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerTaxRepresentative";
			definition = "Details of tax representative. The corporate (buyer) is allowed to use a tax representative for value added tax responsibilities in case the buyer is not registered in a specific value added tax registry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification116.mmObject();
		}

		@Override
		public Optional<PartyIdentification116> getValue(GroupHeader69 obj) {
			return obj.getBuyerTaxRepresentative();
		}

		@Override
		public void setValue(GroupHeader69 obj, Optional<PartyIdentification116> value) {
			obj.setBuyerTaxRepresentative(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LangCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
	 * constraint} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintR5#forGroupHeader69_LanguageCode
	 * ConstraintR5.forGroupHeader69_LanguageCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LanguageCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the language used in the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader69, Optional<LanguageCode>> mmLanguageCode = new MMMessageAttribute<GroupHeader69, Optional<LanguageCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "LangCd";
			constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintR5.forGroupHeader69_LanguageCode);
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LanguageCode";
			definition = "Specifies the language used in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(GroupHeader69 obj) {
			return obj.getLanguageCode();
		}

		@Override
		public void setValue(GroupHeader69 obj, Optional<LanguageCode> value) {
			obj.setLanguageCode(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader69.mmIdentification, com.tools20022.repository.msg.GroupHeader69.mmIssuedDate, com.tools20022.repository.msg.GroupHeader69.mmReportCategory,
						com.tools20022.repository.msg.GroupHeader69.mmTaxReportPurpose, com.tools20022.repository.msg.GroupHeader69.mmOriginalIdentification, com.tools20022.repository.msg.GroupHeader69.mmSellerTaxRepresentative,
						com.tools20022.repository.msg.GroupHeader69.mmBuyerTaxRepresentative, com.tools20022.repository.msg.GroupHeader69.mmLanguageCode);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GroupHeader69";
				definition = "Set of characteristics shared by all individual transactions included in the message.";
				previousVersion_lazy = () -> GroupHeader12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public GroupHeader69 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ISODate getIssuedDate() {
		return issuedDate;
	}

	public GroupHeader69 setIssuedDate(ISODate issuedDate) {
		this.issuedDate = Objects.requireNonNull(issuedDate);
		return this;
	}

	public ExternalDocumentType1Code getReportCategory() {
		return reportCategory;
	}

	public GroupHeader69 setReportCategory(ExternalDocumentType1Code reportCategory) {
		this.reportCategory = Objects.requireNonNull(reportCategory);
		return this;
	}

	public ExternalDocumentType1Code getTaxReportPurpose() {
		return taxReportPurpose;
	}

	public GroupHeader69 setTaxReportPurpose(ExternalDocumentType1Code taxReportPurpose) {
		this.taxReportPurpose = Objects.requireNonNull(taxReportPurpose);
		return this;
	}

	public Optional<Max35Text> getOriginalIdentification() {
		return originalIdentification == null ? Optional.empty() : Optional.of(originalIdentification);
	}

	public GroupHeader69 setOriginalIdentification(Max35Text originalIdentification) {
		this.originalIdentification = originalIdentification;
		return this;
	}

	public Optional<PartyIdentification116> getSellerTaxRepresentative() {
		return sellerTaxRepresentative == null ? Optional.empty() : Optional.of(sellerTaxRepresentative);
	}

	public GroupHeader69 setSellerTaxRepresentative(PartyIdentification116 sellerTaxRepresentative) {
		this.sellerTaxRepresentative = sellerTaxRepresentative;
		return this;
	}

	public Optional<PartyIdentification116> getBuyerTaxRepresentative() {
		return buyerTaxRepresentative == null ? Optional.empty() : Optional.of(buyerTaxRepresentative);
	}

	public GroupHeader69 setBuyerTaxRepresentative(PartyIdentification116 buyerTaxRepresentative) {
		this.buyerTaxRepresentative = buyerTaxRepresentative;
		return this;
	}

	public Optional<LanguageCode> getLanguageCode() {
		return languageCode == null ? Optional.empty() : Optional.of(languageCode);
	}

	public GroupHeader69 setLanguageCode(LanguageCode languageCode) {
		this.languageCode = languageCode;
		return this;
	}
}