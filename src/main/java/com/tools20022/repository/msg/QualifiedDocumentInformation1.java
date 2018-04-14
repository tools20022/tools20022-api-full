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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmAndDigest1;
import com.tools20022.repository.msg.BinaryFile1;
import com.tools20022.repository.msg.QualifiedPartyIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies an identification of a document assigned by and relative to the
 * issuing party (of the identification).<br>
 * Optionally, the component can contain a copy of the identified document and a
 * URI/URL (Universal Resource Information/Location) facilitating retrieval of
 * the document.<br>
 * The component may also contain a cryptographic hash of the referenced
 * document.<br>
 * Financial items are identified by three parts:<br>
 * (1) the creator of the document,<br>
 * (2) an identification of a dossier, and<br>
 * (3) an identification of a financial item.<br>
 * The two latter identifiers are independent permitting to identify the same
 * item in several lists.<br>
 * The element identification is of schema type ID, it can be referenced by
 * IDREF typed elements (composite=false).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmIdentification
 * QualifiedDocumentInformation1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmIssuer
 * QualifiedDocumentInformation1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmItemListIdentifier
 * QualifiedDocumentInformation1.mmItemListIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmItemIdentifier
 * QualifiedDocumentInformation1.mmItemIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmDate
 * QualifiedDocumentInformation1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmVersion
 * QualifiedDocumentInformation1.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmElectronicOriginal
 * QualifiedDocumentInformation1.mmElectronicOriginal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmDigest
 * QualifiedDocumentInformation1.mmDigest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmDocumentType
 * QualifiedDocumentInformation1.mmDocumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmURL
 * QualifiedDocumentInformation1.mmURL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmAttachedFile
 * QualifiedDocumentInformation1.mmAttachedFile}</li>
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
 * "QualifiedDocumentInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an identification of a document assigned by and relative to the issuing party (of the identification).\r\nOptionally, the component can contain a copy of the identified document and a URI/URL (Universal Resource Information/Location) facilitating retrieval of the document.\r\nThe component may also contain a cryptographic hash of the referenced document.\r\nFinancial items are identified by three parts:\r\n(1) the creator of the document,\r\n(2) an identification of a dossier, and\r\n(3) an identification of a financial item.\r\nThe two latter identifiers are independent permitting to identify the same item in several lists.\r\nThe element identification is of schema type ID, it can be referenced by IDREF typed elements (composite=false)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCompressedFormatRule#forQualifiedDocumentInformation1
 * ConstraintCompressedFormatRule.forQualifiedDocumentInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDigestCalculationRule#forQualifiedDocumentInformation1
 * ConstraintDigestCalculationRule.forQualifiedDocumentInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDigestPresenceRule#forQualifiedDocumentInformation1
 * ConstraintDigestPresenceRule.forQualifiedDocumentInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSelfDefiningRule#forQualifiedDocumentInformation1
 * ConstraintSelfDefiningRule.forQualifiedDocumentInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintURLRetrievalPolicyRule#forQualifiedDocumentInformation1
 * ConstraintURLRetrievalPolicyRule.forQualifiedDocumentInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintXMLNamespaceRule#forQualifiedDocumentInformation1
 * ConstraintXMLNamespaceRule.forQualifiedDocumentInformation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QualifiedDocumentInformation1", propOrder = {"identification", "issuer", "itemListIdentifier", "itemIdentifier", "date", "version", "electronicOriginal", "digest", "documentType", "uRL", "attachedFile"})
public class QualifiedDocumentInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected ID identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ID ID}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local identification to be used in IDREFs in this message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QualifiedDocumentInformation1, ID> mmIdentification = new MMMessageAttribute<QualifiedDocumentInformation1, ID>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Local identification to be used in IDREFs in this message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ID.mmObject();
		}

		@Override
		public ID getValue(QualifiedDocumentInformation1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, ID value) {
			obj.setIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party issuing the reference."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QualifiedDocumentInformation1, Optional<QualifiedPartyIdentification1>> mmIssuer = new MMMessageAssociationEnd<QualifiedDocumentInformation1, Optional<QualifiedPartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party issuing the reference.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public Optional<QualifiedPartyIdentification1> getValue(QualifiedDocumentInformation1 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, Optional<QualifiedPartyIdentification1> value) {
			obj.setIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "ItmListIdr")
	protected Max35Text itemListIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmListIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemListIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identifier relative to the issuing party of a list of items."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QualifiedDocumentInformation1, Optional<Max35Text>> mmItemListIdentifier = new MMMessageAttribute<QualifiedDocumentInformation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "ItmListIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemListIdentifier";
			definition = "Unambiguous identifier relative to the issuing party of a list of items.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(QualifiedDocumentInformation1 obj) {
			return obj.getItemListIdentifier();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, Optional<Max35Text> value) {
			obj.setItemListIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "ItmIdr")
	protected Max35Text itemIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identifier relative to the issuing party of an item (independent of any list)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QualifiedDocumentInformation1, Optional<Max35Text>> mmItemIdentifier = new MMMessageAttribute<QualifiedDocumentInformation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "ItmIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIdentifier";
			definition = "Unambiguous identifier relative to the issuing party of an item (independent of any list).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(QualifiedDocumentInformation1 obj) {
			return obj.getItemIdentifier();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, Optional<Max35Text> value) {
			obj.setItemIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "Dt")
	protected ISODate date;
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
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of document or element. This may be used as a control value to indicate a specific version."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QualifiedDocumentInformation1, Optional<ISODate>> mmDate = new MMMessageAttribute<QualifiedDocumentInformation1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date of document or element. This may be used as a control value to indicate a specific version.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(QualifiedDocumentInformation1 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, Optional<ISODate> value) {
			obj.setDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Vrsn")
	protected Max6Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the version of the document or element. This may be used as a control value to indicate a specific version."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QualifiedDocumentInformation1, Optional<Max6Text>> mmVersion = new MMMessageAttribute<QualifiedDocumentInformation1, Optional<Max6Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Identification of the version of the document or element. This may be used as a control value to indicate a specific version.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max6Text.mmObject();
		}

		@Override
		public Optional<Max6Text> getValue(QualifiedDocumentInformation1 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, Optional<Max6Text> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctrncOrgnl", required = true)
	protected YesNoIndicator electronicOriginal;
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
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncOrgnl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicOriginal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If true, document is in its original form, otherwise it is a scanned version."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QualifiedDocumentInformation1, YesNoIndicator> mmElectronicOriginal = new MMMessageAttribute<QualifiedDocumentInformation1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "ElctrncOrgnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicOriginal";
			definition = "If true, document is in its original form, otherwise it is a scanned version.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(QualifiedDocumentInformation1 obj) {
			return obj.getElectronicOriginal();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, YesNoIndicator value) {
			obj.setElectronicOriginal(value);
		}
	};
	@XmlElement(name = "Dgst")
	protected List<AlgorithmAndDigest1> digest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AlgorithmAndDigest1
	 * AlgorithmAndDigest1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dgst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Digest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic hash of the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QualifiedDocumentInformation1, List<AlgorithmAndDigest1>> mmDigest = new MMMessageAssociationEnd<QualifiedDocumentInformation1, List<AlgorithmAndDigest1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Dgst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Digest";
			definition = "Cryptographic hash of the document.";
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AlgorithmAndDigest1.mmObject();
		}

		@Override
		public List<AlgorithmAndDigest1> getValue(QualifiedDocumentInformation1 obj) {
			return obj.getDigest();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, List<AlgorithmAndDigest1> value) {
			obj.setDigest(value);
		}
	};
	@XmlElement(name = "DocTp")
	protected ExternalDocumentType1Code documentType;
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
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the document, for example commercial invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QualifiedDocumentInformation1, Optional<ExternalDocumentType1Code>> mmDocumentType = new MMMessageAttribute<QualifiedDocumentInformation1, Optional<ExternalDocumentType1Code>>() {
		{
			businessElementTrace_lazy = () -> Document.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "DocTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentType";
			definition = "Specifies the type of the document, for example commercial invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}

		@Override
		public Optional<ExternalDocumentType1Code> getValue(QualifiedDocumentInformation1 obj) {
			return obj.getDocumentType();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, Optional<ExternalDocumentType1Code> value) {
			obj.setDocumentType(value.orElse(null));
		}
	};
	@XmlElement(name = "URL")
	protected Max2048Text uRL;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2048Text
	 * Max2048Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
	 * ElectronicAddress.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "URL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "URL (Uniform Resource Locator) where the document can be found."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QualifiedDocumentInformation1, Optional<Max2048Text>> mmURL = new MMMessageAttribute<QualifiedDocumentInformation1, Optional<Max2048Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "URL";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URL";
			definition = "URL (Uniform Resource Locator) where the document can be found.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2048Text.mmObject();
		}

		@Override
		public Optional<Max2048Text> getValue(QualifiedDocumentInformation1 obj) {
			return obj.getURL();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, Optional<Max2048Text> value) {
			obj.setURL(value.orElse(null));
		}
	};
	@XmlElement(name = "AttchdFile")
	protected List<BinaryFile1> attachedFile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BinaryFile1
	 * BinaryFile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdFile"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Attached file for this document. The file must be in a self-describing format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QualifiedDocumentInformation1, List<BinaryFile1>> mmAttachedFile = new MMMessageAssociationEnd<QualifiedDocumentInformation1, List<BinaryFile1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "AttchdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedFile";
			definition = "Attached file for this document. The file must be in a self-describing format.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BinaryFile1.mmObject();
		}

		@Override
		public List<BinaryFile1> getValue(QualifiedDocumentInformation1 obj) {
			return obj.getAttachedFile();
		}

		@Override
		public void setValue(QualifiedDocumentInformation1 obj, List<BinaryFile1> value) {
			obj.setAttachedFile(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QualifiedDocumentInformation1.mmIdentification, com.tools20022.repository.msg.QualifiedDocumentInformation1.mmIssuer,
						com.tools20022.repository.msg.QualifiedDocumentInformation1.mmItemListIdentifier, com.tools20022.repository.msg.QualifiedDocumentInformation1.mmItemIdentifier,
						com.tools20022.repository.msg.QualifiedDocumentInformation1.mmDate, com.tools20022.repository.msg.QualifiedDocumentInformation1.mmVersion,
						com.tools20022.repository.msg.QualifiedDocumentInformation1.mmElectronicOriginal, com.tools20022.repository.msg.QualifiedDocumentInformation1.mmDigest,
						com.tools20022.repository.msg.QualifiedDocumentInformation1.mmDocumentType, com.tools20022.repository.msg.QualifiedDocumentInformation1.mmURL,
						com.tools20022.repository.msg.QualifiedDocumentInformation1.mmAttachedFile);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCompressedFormatRule.forQualifiedDocumentInformation1,
						com.tools20022.repository.constraints.ConstraintDigestCalculationRule.forQualifiedDocumentInformation1, com.tools20022.repository.constraints.ConstraintDigestPresenceRule.forQualifiedDocumentInformation1,
						com.tools20022.repository.constraints.ConstraintSelfDefiningRule.forQualifiedDocumentInformation1, com.tools20022.repository.constraints.ConstraintURLRetrievalPolicyRule.forQualifiedDocumentInformation1,
						com.tools20022.repository.constraints.ConstraintXMLNamespaceRule.forQualifiedDocumentInformation1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QualifiedDocumentInformation1";
				definition = "Specifies an identification of a document assigned by and relative to the issuing party (of the identification).\r\nOptionally, the component can contain a copy of the identified document and a URI/URL (Universal Resource Information/Location) facilitating retrieval of the document.\r\nThe component may also contain a cryptographic hash of the referenced document.\r\nFinancial items are identified by three parts:\r\n(1) the creator of the document,\r\n(2) an identification of a dossier, and\r\n(3) an identification of a financial item.\r\nThe two latter identifiers are independent permitting to identify the same item in several lists.\r\nThe element identification is of schema type ID, it can be referenced by IDREF typed elements (composite=false).";
			}
		});
		return mmObject_lazy.get();
	}

	public ID getIdentification() {
		return identification;
	}

	public QualifiedDocumentInformation1 setIdentification(ID identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<QualifiedPartyIdentification1> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public QualifiedDocumentInformation1 setIssuer(QualifiedPartyIdentification1 issuer) {
		this.issuer = issuer;
		return this;
	}

	public Optional<Max35Text> getItemListIdentifier() {
		return itemListIdentifier == null ? Optional.empty() : Optional.of(itemListIdentifier);
	}

	public QualifiedDocumentInformation1 setItemListIdentifier(Max35Text itemListIdentifier) {
		this.itemListIdentifier = itemListIdentifier;
		return this;
	}

	public Optional<Max35Text> getItemIdentifier() {
		return itemIdentifier == null ? Optional.empty() : Optional.of(itemIdentifier);
	}

	public QualifiedDocumentInformation1 setItemIdentifier(Max35Text itemIdentifier) {
		this.itemIdentifier = itemIdentifier;
		return this;
	}

	public Optional<ISODate> getDate() {
		return date == null ? Optional.empty() : Optional.of(date);
	}

	public QualifiedDocumentInformation1 setDate(ISODate date) {
		this.date = date;
		return this;
	}

	public Optional<Max6Text> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public QualifiedDocumentInformation1 setVersion(Max6Text version) {
		this.version = version;
		return this;
	}

	public YesNoIndicator getElectronicOriginal() {
		return electronicOriginal;
	}

	public QualifiedDocumentInformation1 setElectronicOriginal(YesNoIndicator electronicOriginal) {
		this.electronicOriginal = Objects.requireNonNull(electronicOriginal);
		return this;
	}

	public List<AlgorithmAndDigest1> getDigest() {
		return digest == null ? digest = new ArrayList<>() : digest;
	}

	public QualifiedDocumentInformation1 setDigest(List<AlgorithmAndDigest1> digest) {
		this.digest = Objects.requireNonNull(digest);
		return this;
	}

	public Optional<ExternalDocumentType1Code> getDocumentType() {
		return documentType == null ? Optional.empty() : Optional.of(documentType);
	}

	public QualifiedDocumentInformation1 setDocumentType(ExternalDocumentType1Code documentType) {
		this.documentType = documentType;
		return this;
	}

	public Optional<Max2048Text> getURL() {
		return uRL == null ? Optional.empty() : Optional.of(uRL);
	}

	public QualifiedDocumentInformation1 setURL(Max2048Text uRL) {
		this.uRL = uRL;
		return this;
	}

	public List<BinaryFile1> getAttachedFile() {
		return attachedFile == null ? attachedFile = new ArrayList<>() : attachedFile;
	}

	public QualifiedDocumentInformation1 setAttachedFile(List<BinaryFile1> attachedFile) {
		this.attachedFile = Objects.requireNonNull(attachedFile);
		return this;
	}
}