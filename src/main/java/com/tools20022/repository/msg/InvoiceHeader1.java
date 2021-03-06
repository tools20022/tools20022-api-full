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
import com.tools20022.repository.area.tsin.FinancialInvoiceV01;
import com.tools20022.repository.codeset.ExternalDocumentPurpose1Code;
import com.tools20022.repository.codeset.ExternalDocumentType1Code;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.DocumentIssuer;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalInformation6;
import com.tools20022.repository.msg.TradeParty1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Collection of data for that is exchanged between two or more parties in
 * written, printed or electronic form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmIdentification
 * InvoiceHeader1.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmTypeCode
 * InvoiceHeader1.mmTypeCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmName
 * InvoiceHeader1.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmIssueDateTime
 * InvoiceHeader1.mmIssueDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmIssuer
 * InvoiceHeader1.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmLanguageCode
 * InvoiceHeader1.mmLanguageCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmCopyIndicator
 * InvoiceHeader1.mmCopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmDocumentPurpose
 * InvoiceHeader1.mmDocumentPurpose}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmIncludedNote
 * InvoiceHeader1.mmIncludedNote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmInvoiceHeader
 * FinancialInvoiceV01.mmInvoiceHeader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Collection of data for that is exchanged between two or more parties in written, printed or electronic form."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2 InvoiceHeader2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceHeader1", propOrder = {"identification", "typeCode", "name", "issueDateTime", "issuer", "languageCode", "copyIndicator", "documentPurpose", "includedNote"})
public class InvoiceHeader1 {

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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of this invoice document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIdentification
	 * InvoiceHeader2.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader1, Max35Text> mmIdentification = new MMMessageAttribute<InvoiceHeader1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification of this invoice document.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InvoiceHeader1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(InvoiceHeader1 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "TpCd", required = true)
	protected ExternalDocumentType1Code typeCode;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmType
	 * Document.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the document, for example commercial invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmTypeCode
	 * InvoiceHeader2.mmTypeCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader1, ExternalDocumentType1Code> mmTypeCode = new MMMessageAttribute<InvoiceHeader1, ExternalDocumentType1Code>() {
		{
			businessElementTrace_lazy = () -> Document.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
			isDerived = false;
			xmlTag = "TpCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeCode";
			definition = "Specifies the type of the document, for example commercial invoice.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmTypeCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}

		@Override
		public ExternalDocumentType1Code getValue(InvoiceHeader1 obj) {
			return obj.getTypeCode();
		}

		@Override
		public void setValue(InvoiceHeader1 obj, ExternalDocumentType1Code value) {
			obj.setTypeCode(value);
		}
	};
	@XmlElement(name = "Nm")
	protected List<Max35Text> name;
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
	 * Document.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of invoice document or transaction, for example, tax invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmName
	 * InvoiceHeader2.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader1, List<Max35Text>> mmName = new MMMessageAttribute<InvoiceHeader1, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Document.mmDocumentIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of invoice document or transaction, for example, tax invoice.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmName);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(InvoiceHeader1 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(InvoiceHeader1 obj, List<Max35Text> value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "IsseDtTm", required = true)
	protected ISODateTime issueDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIssueDateTime
	 * InvoiceHeader2.mmIssueDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader1, ISODateTime> mmIssueDateTime = new MMMessageAttribute<InvoiceHeader1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
			isDerived = false;
			xmlTag = "IsseDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDateTime";
			definition = "Issue date of the document.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmIssueDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InvoiceHeader1 obj) {
			return obj.getIssueDateTime();
		}

		@Override
		public void setValue(InvoiceHeader1 obj, ISODateTime value) {
			obj.setIssueDateTime(value);
		}
	};
	@XmlElement(name = "Issr")
	protected TradeParty1 issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DocumentIssuer
	 * DocumentIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that issued this invoice document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIssuer
	 * InvoiceHeader2.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceHeader1, Optional<TradeParty1>> mmIssuer = new MMMessageAssociationEnd<InvoiceHeader1, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> DocumentIssuer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party that issued this invoice document.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmIssuer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(InvoiceHeader1 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(InvoiceHeader1 obj, Optional<TradeParty1> value) {
			obj.setIssuer(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LangCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LanguageCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a language used in this invoice document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmLanguageCode
	 * InvoiceHeader2.mmLanguageCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader1, Optional<LanguageCode>> mmLanguageCode = new MMMessageAttribute<InvoiceHeader1, Optional<LanguageCode>>() {
		{
			businessElementTrace_lazy = () -> Document.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
			isDerived = false;
			xmlTag = "LangCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LanguageCode";
			definition = "Unique identifier for a language used in this invoice document.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmLanguageCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(InvoiceHeader1 obj) {
			return obj.getLanguageCode();
		}

		@Override
		public void setValue(InvoiceHeader1 obj, Optional<LanguageCode> value) {
			obj.setLanguageCode(value.orElse(null));
		}
	};
	@XmlElement(name = "CpyInd")
	protected YesNoIndicator copyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator that the document is a copy of the\noriginal document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmCopyIndicator
	 * InvoiceHeader2.mmCopyIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader1, Optional<YesNoIndicator>> mmCopyIndicator = new MMMessageAttribute<InvoiceHeader1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
			isDerived = false;
			xmlTag = "CpyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyIndicator";
			definition = "Indicator that the document is a copy of the\noriginal document.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmCopyIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvoiceHeader1 obj) {
			return obj.getCopyIndicator();
		}

		@Override
		public void setValue(InvoiceHeader1 obj, Optional<YesNoIndicator> value) {
			obj.setCopyIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocPurp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the function of the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmDocumentPurpose
	 * InvoiceHeader2.mmDocumentPurpose}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader1, Optional<ExternalDocumentPurpose1Code>> mmDocumentPurpose = new MMMessageAttribute<InvoiceHeader1, Optional<ExternalDocumentPurpose1Code>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
			isDerived = false;
			xmlTag = "DocPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentPurpose";
			definition = "Specifies the function of the document.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmDocumentPurpose);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalDocumentPurpose1Code.mmObject();
		}

		@Override
		public Optional<ExternalDocumentPurpose1Code> getValue(InvoiceHeader1 obj) {
			return obj.getDocumentPurpose();
		}

		@Override
		public void setValue(InvoiceHeader1 obj, Optional<ExternalDocumentPurpose1Code> value) {
			obj.setDocumentPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "InclNote")
	protected List<AdditionalInformation6> includedNote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation6
	 * AdditionalInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InclNote"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncludedNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Note included in this invoice document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIncludedNote
	 * InvoiceHeader2.mmIncludedNote}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader1, List<AdditionalInformation6>> mmIncludedNote = new MMMessageAttribute<InvoiceHeader1, List<AdditionalInformation6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
			isDerived = false;
			xmlTag = "InclNote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedNote";
			definition = "Note included in this invoice document.";
			nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmIncludedNote);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalInformation6.mmObject();
		}

		@Override
		public List<AdditionalInformation6> getValue(InvoiceHeader1 obj) {
			return obj.getIncludedNote();
		}

		@Override
		public void setValue(InvoiceHeader1 obj, List<AdditionalInformation6> value) {
			obj.setIncludedNote(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceHeader1.mmIdentification, com.tools20022.repository.msg.InvoiceHeader1.mmTypeCode, com.tools20022.repository.msg.InvoiceHeader1.mmName,
						com.tools20022.repository.msg.InvoiceHeader1.mmIssueDateTime, com.tools20022.repository.msg.InvoiceHeader1.mmIssuer, com.tools20022.repository.msg.InvoiceHeader1.mmLanguageCode,
						com.tools20022.repository.msg.InvoiceHeader1.mmCopyIndicator, com.tools20022.repository.msg.InvoiceHeader1.mmDocumentPurpose, com.tools20022.repository.msg.InvoiceHeader1.mmIncludedNote);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInvoiceV01.mmInvoiceHeader);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceHeader1";
				definition = "Collection of data for that is exchanged between two or more parties in written, printed or electronic form.";
				nextVersions_lazy = () -> Arrays.asList(InvoiceHeader2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public InvoiceHeader1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ExternalDocumentType1Code getTypeCode() {
		return typeCode;
	}

	public InvoiceHeader1 setTypeCode(ExternalDocumentType1Code typeCode) {
		this.typeCode = Objects.requireNonNull(typeCode);
		return this;
	}

	public List<Max35Text> getName() {
		return name == null ? name = new ArrayList<>() : name;
	}

	public InvoiceHeader1 setName(List<Max35Text> name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public ISODateTime getIssueDateTime() {
		return issueDateTime;
	}

	public InvoiceHeader1 setIssueDateTime(ISODateTime issueDateTime) {
		this.issueDateTime = Objects.requireNonNull(issueDateTime);
		return this;
	}

	public Optional<TradeParty1> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public InvoiceHeader1 setIssuer(TradeParty1 issuer) {
		this.issuer = issuer;
		return this;
	}

	public Optional<LanguageCode> getLanguageCode() {
		return languageCode == null ? Optional.empty() : Optional.of(languageCode);
	}

	public InvoiceHeader1 setLanguageCode(LanguageCode languageCode) {
		this.languageCode = languageCode;
		return this;
	}

	public Optional<YesNoIndicator> getCopyIndicator() {
		return copyIndicator == null ? Optional.empty() : Optional.of(copyIndicator);
	}

	public InvoiceHeader1 setCopyIndicator(YesNoIndicator copyIndicator) {
		this.copyIndicator = copyIndicator;
		return this;
	}

	public Optional<ExternalDocumentPurpose1Code> getDocumentPurpose() {
		return documentPurpose == null ? Optional.empty() : Optional.of(documentPurpose);
	}

	public InvoiceHeader1 setDocumentPurpose(ExternalDocumentPurpose1Code documentPurpose) {
		this.documentPurpose = documentPurpose;
		return this;
	}

	public List<AdditionalInformation6> getIncludedNote() {
		return includedNote == null ? includedNote = new ArrayList<>() : includedNote;
	}

	public InvoiceHeader1 setIncludedNote(List<AdditionalInformation6> includedNote) {
		this.includedNote = Objects.requireNonNull(includedNote);
		return this;
	}
}