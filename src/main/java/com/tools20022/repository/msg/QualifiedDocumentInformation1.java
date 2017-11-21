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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QualifiedDocumentInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an identification of a document assigned by and relative to the issuing party (of the identification).\r\nOptionally, the component can contain a copy of the identified document and a URI/URL (Universal Resource Information/Location) facilitating retrieval of the document.\r\nThe component may also contain a cryptographic hash of the referenced document.\r\nFinancial items are identified by three parts:\r\n(1) the creator of the document,\r\n(2) an identification of a dossier, and\r\n(3) an identification of a financial item.\r\nThe two latter identifiers are independent permitting to identify the same item in several lists.\r\nThe element identification is of schema type ID, it can be referenced by IDREF typed elements (composite=false)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "QualifiedDocumentInformation1", propOrder = {"identification", "issuer", "itemListIdentifier", "itemIdentifier", "date", "version", "electronicOriginal", "digest", "documentType", "URL", "attachedFile"})
public class QualifiedDocumentInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ID identification;
	/**
	 * Local identification to be used in IDREFs in this message.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local identification to be used in IDREFs in this message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Local identification to be used in IDREFs in this message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ID.mmObject();
		}
	};
	protected QualifiedPartyIdentification1 issuer;
	/**
	 * Party issuing the reference.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party issuing the reference."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party issuing the reference.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected Max35Text itemListIdentifier;
	/**
	 * Unambiguous identifier relative to the issuing party of a list of items.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemListIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identifier relative to the issuing party of a list of items."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmItemListIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "ItmListIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemListIdentifier";
			definition = "Unambiguous identifier relative to the issuing party of a list of items.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text itemIdentifier;
	/**
	 * Unambiguous identifier relative to the issuing party of an item
	 * (independent of any list).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identifier relative to the issuing party of an item (independent of any list)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmItemIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "ItmIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemIdentifier";
			definition = "Unambiguous identifier relative to the issuing party of an item (independent of any list).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate date;
	/**
	 * Date of document or element. This may be used as a control value to
	 * indicate a specific version.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of document or element. This may be used as a control value to indicate a specific version."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date of document or element. This may be used as a control value to indicate a specific version.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max6Text version;
	/**
	 * Identification of the version of the document or element. This may be
	 * used as a control value to indicate a specific version.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the version of the document or element. This may be used as a control value to indicate a specific version."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Identification of the version of the document or element. This may be used as a control value to indicate a specific version.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};
	protected YesNoIndicator electronicOriginal;
	/**
	 * If true, document is in its original form, otherwise it is a scanned
	 * version.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicOriginal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If true, document is in its original form, otherwise it is a scanned version."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicOriginal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "ElctrncOrgnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicOriginal";
			definition = "If true, document is in its original form, otherwise it is a scanned version.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AlgorithmAndDigest1> digest;
	/**
	 * Cryptographic hash of the document.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Digest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic hash of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDigest = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "Dgst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Digest";
			definition = "Cryptographic hash of the document.";
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AlgorithmAndDigest1.mmObject();
		}
	};
	protected ExternalDocumentType1Code documentType;
	/**
	 * Specifies the type of the document, for example commercial invoice.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the document, for example commercial invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDocumentType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmType;
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "DocTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentType";
			definition = "Specifies the type of the document, for example commercial invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}
	};
	protected Max2048Text uRL;
	/**
	 * URL (Uniform Resource Locator) where the document can be found.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "URL (Uniform Resource Locator) where the document can be found."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmURL = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "URL";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URL";
			definition = "URL (Uniform Resource Locator) where the document can be found.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2048Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BinaryFile1> attachedFile;
	/**
	 * Attached file for this document. The file must be in a self-describing
	 * format.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Attached file for this document. The file must be in a self-describing format."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAttachedFile = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> QualifiedDocumentInformation1.mmObject();
			isDerived = false;
			xmlTag = "AttchdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedFile";
			definition = "Attached file for this document. The file must be in a self-describing format.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BinaryFile1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QualifiedDocumentInformation1.mmIdentification, QualifiedDocumentInformation1.mmIssuer, QualifiedDocumentInformation1.mmItemListIdentifier,
						QualifiedDocumentInformation1.mmItemIdentifier, QualifiedDocumentInformation1.mmDate, QualifiedDocumentInformation1.mmVersion, QualifiedDocumentInformation1.mmElectronicOriginal,
						QualifiedDocumentInformation1.mmDigest, QualifiedDocumentInformation1.mmDocumentType, QualifiedDocumentInformation1.mmURL, QualifiedDocumentInformation1.mmAttachedFile);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QualifiedDocumentInformation1";
				definition = "Specifies an identification of a document assigned by and relative to the issuing party (of the identification).\r\nOptionally, the component can contain a copy of the identified document and a URI/URL (Universal Resource Information/Location) facilitating retrieval of the document.\r\nThe component may also contain a cryptographic hash of the referenced document.\r\nFinancial items are identified by three parts:\r\n(1) the creator of the document,\r\n(2) an identification of a dossier, and\r\n(3) an identification of a financial item.\r\nThe two latter identifiers are independent permitting to identify the same item in several lists.\r\nThe element identification is of schema type ID, it can be referenced by IDREF typed elements (composite=false).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public ID getIdentification() {
		return identification;
	}

	public void setIdentification(ID identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Issr")
	public QualifiedPartyIdentification1 getIssuer() {
		return issuer;
	}

	public void setIssuer(com.tools20022.repository.msg.QualifiedPartyIdentification1 issuer) {
		this.issuer = issuer;
	}

	@XmlElement(name = "ItmListIdr")
	public Max35Text getItemListIdentifier() {
		return itemListIdentifier;
	}

	public void setItemListIdentifier(Max35Text itemListIdentifier) {
		this.itemListIdentifier = itemListIdentifier;
	}

	@XmlElement(name = "ItmIdr")
	public Max35Text getItemIdentifier() {
		return itemIdentifier;
	}

	public void setItemIdentifier(Max35Text itemIdentifier) {
		this.itemIdentifier = itemIdentifier;
	}

	@XmlElement(name = "Dt")
	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	@XmlElement(name = "Vrsn")
	public Max6Text getVersion() {
		return version;
	}

	public void setVersion(Max6Text version) {
		this.version = version;
	}

	@XmlElement(name = "ElctrncOrgnl", required = true)
	public YesNoIndicator getElectronicOriginal() {
		return electronicOriginal;
	}

	public void setElectronicOriginal(YesNoIndicator electronicOriginal) {
		this.electronicOriginal = electronicOriginal;
	}

	@XmlElement(name = "Dgst")
	public List<AlgorithmAndDigest1> getDigest() {
		return digest;
	}

	public void setDigest(List<com.tools20022.repository.msg.AlgorithmAndDigest1> digest) {
		this.digest = digest;
	}

	@XmlElement(name = "DocTp")
	public ExternalDocumentType1Code getDocumentType() {
		return documentType;
	}

	public void setDocumentType(ExternalDocumentType1Code documentType) {
		this.documentType = documentType;
	}

	@XmlElement(name = "URL")
	public Max2048Text getURL() {
		return uRL;
	}

	public void setURL(Max2048Text uRL) {
		this.uRL = uRL;
	}

	@XmlElement(name = "AttchdFile")
	public List<BinaryFile1> getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(List<com.tools20022.repository.msg.BinaryFile1> attachedFile) {
		this.attachedFile = attachedFile;
	}
}