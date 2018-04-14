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
import com.tools20022.repository.msg.TradeParty4;
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
 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmIdentification
 * InvoiceHeader3.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmTypeCode
 * InvoiceHeader3.mmTypeCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmName
 * InvoiceHeader3.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmIssueDateTime
 * InvoiceHeader3.mmIssueDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmIssuer
 * InvoiceHeader3.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmLanguageCode
 * InvoiceHeader3.mmLanguageCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmCopyIndicator
 * InvoiceHeader3.mmCopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmDocumentPurpose
 * InvoiceHeader3.mmDocumentPurpose}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmIncludedNote
 * InvoiceHeader3.mmIncludedNote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceHeader3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Collection of data for that is exchanged between two or more parties in written, printed or electronic form."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.InvoiceHeader2
 * InvoiceHeader2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceHeader3", propOrder = {"identification", "typeCode", "name", "issueDateTime", "issuer", "languageCode", "copyIndicator", "documentPurpose", "includedNote"})
public class InvoiceHeader3 {

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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIdentification
	 * InvoiceHeader2.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader3, Max35Text> mmIdentification = new MMMessageAttribute<InvoiceHeader3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification of this invoice document.";
			previousVersion_lazy = () -> InvoiceHeader2.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InvoiceHeader3 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(InvoiceHeader3 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmTypeCode
	 * InvoiceHeader2.mmTypeCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader3, ExternalDocumentType1Code> mmTypeCode = new MMMessageAttribute<InvoiceHeader3, ExternalDocumentType1Code>() {
		{
			businessElementTrace_lazy = () -> Document.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader3.mmObject();
			isDerived = false;
			xmlTag = "TpCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeCode";
			definition = "Specifies the type of the document, for example commercial invoice.";
			previousVersion_lazy = () -> InvoiceHeader2.mmTypeCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}

		@Override
		public ExternalDocumentType1Code getValue(InvoiceHeader3 obj) {
			return obj.getTypeCode();
		}

		@Override
		public void setValue(InvoiceHeader3 obj, ExternalDocumentType1Code value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmName
	 * InvoiceHeader2.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader3, List<Max35Text>> mmName = new MMMessageAttribute<InvoiceHeader3, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Document.mmDocumentIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of invoice document or transaction, for example, tax invoice.";
			previousVersion_lazy = () -> InvoiceHeader2.mmName;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(InvoiceHeader3 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(InvoiceHeader3 obj, List<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIssueDateTime
	 * InvoiceHeader2.mmIssueDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader3, ISODateTime> mmIssueDateTime = new MMMessageAttribute<InvoiceHeader3, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader3.mmObject();
			isDerived = false;
			xmlTag = "IsseDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDateTime";
			definition = "Issue date of the document.";
			previousVersion_lazy = () -> InvoiceHeader2.mmIssueDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InvoiceHeader3 obj) {
			return obj.getIssueDateTime();
		}

		@Override
		public void setValue(InvoiceHeader3 obj, ISODateTime value) {
			obj.setIssueDateTime(value);
		}
	};
	@XmlElement(name = "Issr")
	protected TradeParty4 issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty4
	 * TradeParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DocumentIssuer
	 * DocumentIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIssuer
	 * InvoiceHeader2.mmIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceHeader3, Optional<TradeParty4>> mmIssuer = new MMMessageAssociationEnd<InvoiceHeader3, Optional<TradeParty4>>() {
		{
			businessComponentTrace_lazy = () -> DocumentIssuer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader3.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party that issued this invoice document.";
			previousVersion_lazy = () -> InvoiceHeader2.mmIssuer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty4.mmObject();
		}

		@Override
		public Optional<TradeParty4> getValue(InvoiceHeader3 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(InvoiceHeader3 obj, Optional<TradeParty4> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmLanguageCode
	 * InvoiceHeader2.mmLanguageCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader3, Optional<LanguageCode>> mmLanguageCode = new MMMessageAttribute<InvoiceHeader3, Optional<LanguageCode>>() {
		{
			businessElementTrace_lazy = () -> Document.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader3.mmObject();
			isDerived = false;
			xmlTag = "LangCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LanguageCode";
			definition = "Unique identifier for a language used in this invoice document.";
			previousVersion_lazy = () -> InvoiceHeader2.mmLanguageCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(InvoiceHeader3 obj) {
			return obj.getLanguageCode();
		}

		@Override
		public void setValue(InvoiceHeader3 obj, Optional<LanguageCode> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmCopyIndicator
	 * InvoiceHeader2.mmCopyIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader3, Optional<YesNoIndicator>> mmCopyIndicator = new MMMessageAttribute<InvoiceHeader3, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader3.mmObject();
			isDerived = false;
			xmlTag = "CpyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyIndicator";
			definition = "Indicator that the document is a copy of the\noriginal document.";
			previousVersion_lazy = () -> InvoiceHeader2.mmCopyIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvoiceHeader3 obj) {
			return obj.getCopyIndicator();
		}

		@Override
		public void setValue(InvoiceHeader3 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmDocumentPurpose
	 * InvoiceHeader2.mmDocumentPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader3, Optional<ExternalDocumentPurpose1Code>> mmDocumentPurpose = new MMMessageAttribute<InvoiceHeader3, Optional<ExternalDocumentPurpose1Code>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader3.mmObject();
			isDerived = false;
			xmlTag = "DocPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentPurpose";
			definition = "Specifies the function of the document.";
			previousVersion_lazy = () -> InvoiceHeader2.mmDocumentPurpose;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalDocumentPurpose1Code.mmObject();
		}

		@Override
		public Optional<ExternalDocumentPurpose1Code> getValue(InvoiceHeader3 obj) {
			return obj.getDocumentPurpose();
		}

		@Override
		public void setValue(InvoiceHeader3 obj, Optional<ExternalDocumentPurpose1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIncludedNote
	 * InvoiceHeader2.mmIncludedNote}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceHeader3, List<AdditionalInformation6>> mmIncludedNote = new MMMessageAttribute<InvoiceHeader3, List<AdditionalInformation6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceHeader3.mmObject();
			isDerived = false;
			xmlTag = "InclNote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedNote";
			definition = "Note included in this invoice document.";
			previousVersion_lazy = () -> InvoiceHeader2.mmIncludedNote;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalInformation6.mmObject();
		}

		@Override
		public List<AdditionalInformation6> getValue(InvoiceHeader3 obj) {
			return obj.getIncludedNote();
		}

		@Override
		public void setValue(InvoiceHeader3 obj, List<AdditionalInformation6> value) {
			obj.setIncludedNote(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceHeader3.mmIdentification, com.tools20022.repository.msg.InvoiceHeader3.mmTypeCode, com.tools20022.repository.msg.InvoiceHeader3.mmName,
						com.tools20022.repository.msg.InvoiceHeader3.mmIssueDateTime, com.tools20022.repository.msg.InvoiceHeader3.mmIssuer, com.tools20022.repository.msg.InvoiceHeader3.mmLanguageCode,
						com.tools20022.repository.msg.InvoiceHeader3.mmCopyIndicator, com.tools20022.repository.msg.InvoiceHeader3.mmDocumentPurpose, com.tools20022.repository.msg.InvoiceHeader3.mmIncludedNote);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceHeader3";
				definition = "Collection of data for that is exchanged between two or more parties in written, printed or electronic form.";
				previousVersion_lazy = () -> InvoiceHeader2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public InvoiceHeader3 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ExternalDocumentType1Code getTypeCode() {
		return typeCode;
	}

	public InvoiceHeader3 setTypeCode(ExternalDocumentType1Code typeCode) {
		this.typeCode = Objects.requireNonNull(typeCode);
		return this;
	}

	public List<Max35Text> getName() {
		return name == null ? name = new ArrayList<>() : name;
	}

	public InvoiceHeader3 setName(List<Max35Text> name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public ISODateTime getIssueDateTime() {
		return issueDateTime;
	}

	public InvoiceHeader3 setIssueDateTime(ISODateTime issueDateTime) {
		this.issueDateTime = Objects.requireNonNull(issueDateTime);
		return this;
	}

	public Optional<TradeParty4> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public InvoiceHeader3 setIssuer(TradeParty4 issuer) {
		this.issuer = issuer;
		return this;
	}

	public Optional<LanguageCode> getLanguageCode() {
		return languageCode == null ? Optional.empty() : Optional.of(languageCode);
	}

	public InvoiceHeader3 setLanguageCode(LanguageCode languageCode) {
		this.languageCode = languageCode;
		return this;
	}

	public Optional<YesNoIndicator> getCopyIndicator() {
		return copyIndicator == null ? Optional.empty() : Optional.of(copyIndicator);
	}

	public InvoiceHeader3 setCopyIndicator(YesNoIndicator copyIndicator) {
		this.copyIndicator = copyIndicator;
		return this;
	}

	public Optional<ExternalDocumentPurpose1Code> getDocumentPurpose() {
		return documentPurpose == null ? Optional.empty() : Optional.of(documentPurpose);
	}

	public InvoiceHeader3 setDocumentPurpose(ExternalDocumentPurpose1Code documentPurpose) {
		this.documentPurpose = documentPurpose;
		return this;
	}

	public List<AdditionalInformation6> getIncludedNote() {
		return includedNote == null ? includedNote = new ArrayList<>() : includedNote;
	}

	public InvoiceHeader3 setIncludedNote(List<AdditionalInformation6> includedNote) {
		this.includedNote = Objects.requireNonNull(includedNote);
		return this;
	}
}