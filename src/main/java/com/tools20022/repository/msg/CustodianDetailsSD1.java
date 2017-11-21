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
import com.tools20022.repository.codeset.CustodianAction1Code;
import com.tools20022.repository.codeset.CustodianRecordAgreementType1Code;
import com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code;
import com.tools20022.repository.codeset.GCAActionType1Code;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information regarding custodian service record.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmPlaceAndName
 * CustodianDetailsSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmCustodianCorporateActionRecordIdentification
 * CustodianDetailsSD1.mmCustodianCorporateActionRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmAgreeIndicator
 * CustodianDetailsSD1.mmAgreeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmCompletenessIndicator
 * CustodianDetailsSD1.mmCompletenessIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmCustodianActionIndicator
 * CustodianDetailsSD1.mmCustodianActionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmGCAActionIndicator
 * CustodianDetailsSD1.mmGCAActionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmReceivingBIC
 * CustodianDetailsSD1.mmReceivingBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmOriginatingBIC
 * CustodianDetailsSD1.mmOriginatingBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmCompositeNotInSubscriptionFlag
 * CustodianDetailsSD1.mmCompositeNotInSubscriptionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#mmRelatedCustodianMessageDetails
 * CustodianDetailsSD1.mmRelatedCustodianMessageDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodianDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information regarding custodian service record."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CustodianDetailsSD1", propOrder = {"placeAndName", "custodianCorporateActionRecordIdentification", "agreeIndicator", "completenessIndicator", "custodianActionIndicator", "GCAActionIndicator", "receivingBIC",
		"originatingBIC", "compositeNotInSubscriptionFlag", "relatedCustodianMessageDetails"})
public class CustodianDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text custodianCorporateActionRecordIdentification;
	/**
	 * Unique identifier of a custodian corporate action record. Applicable to
	 * custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnCorpActnRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianCorporateActionRecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of a custodian corporate action record. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustodianCorporateActionRecordIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CtdnCorpActnRcrdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianCorporateActionRecordIdentification";
			definition = "Unique identifier of a custodian corporate action record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CustodianRecordAgreementType1Code agreeIndicator;
	/**
	 * Indicates the state of the agreement of the custodian record when
	 * compared to composite record. Applicable to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordAgreementType1Code
	 * CustodianRecordAgreementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the state of the agreement of the custodian record when compared to composite record. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgreeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "AgrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreeIndicator";
			definition = "Indicates the state of the agreement of the custodian record when compared to composite record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustodianRecordAgreementType1Code.mmObject();
		}
	};
	protected CustodianRecordCompletenessType1Code completenessIndicator;
	/**
	 * Indicates state of the details of the custodian record on the system.
	 * Applicable to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code
	 * CustodianRecordCompletenessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltnsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletenessIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates state of the details of the custodian record on the system. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompletenessIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CmpltnsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletenessIndicator";
			definition = "Indicates state of the details of the custodian record on the system. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustodianRecordCompletenessType1Code.mmObject();
		}
	};
	protected CustodianAction1Code custodianActionIndicator;
	/**
	 * Represents the status of custodian activity when applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianAction1Code
	 * CustodianAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnActnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianActionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the status of custodian activity when applicable."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustodianActionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CtdnActnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianActionIndicator";
			definition = "Represents the status of custodian activity when applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CustodianAction1Code.mmObject();
		}
	};
	protected GCAActionType1Code gCAActionIndicator;
	/**
	 * Indicates what action needs to be taken by the GCA (Global Corporate
	 * Action) validation service for this particular record. Applicable to
	 * custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GCAActionType1Code
	 * GCAActionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GCAActnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GCAActionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates what action needs to be taken by the GCA (Global Corporate Action) validation service for this particular record. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGCAActionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "GCAActnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GCAActionIndicator";
			definition = "Indicates what action needs to be taken by the GCA (Global Corporate Action) validation service for this particular record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GCAActionType1Code.mmObject();
		}
	};
	protected AnyBICIdentifier receivingBIC;
	/**
	 * BIC which is configured as a recipient of the custodian record.
	 * Applicable to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BIC which is configured as a recipient of the custodian record. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivingBIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvgBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingBIC";
			definition = "BIC which is configured as a recipient of the custodian record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected AnyBICIdentifier originatingBIC;
	/**
	 * BIC which is configured as a sender of the custodian record. Applicable
	 * to custodian service only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtgBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BIC which is configured as a sender of the custodian record. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginatingBIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OrgtgBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingBIC";
			definition = "BIC which is configured as a sender of the custodian record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected YesNoIndicator compositeNotInSubscriptionFlag;
	/**
	 * Indicates whether the event security of the corresponding composite
	 * record is on SOI (security of interest) subscription. Applicable to
	 * custodian service only.
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
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpsitNotInSbcptFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompositeNotInSubscriptionFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event security of the  corresponding composite record is on SOI (security of interest) subscription. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompositeNotInSubscriptionFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CmpsitNotInSbcptFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompositeNotInSubscriptionFlag";
			definition = "Indicates whether the event security of the  corresponding composite record is on SOI (security of interest) subscription. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1> relatedCustodianMessageDetails;
	/**
	 * Provides selected corporate action events message details extracted from
	 * the related custodian messages received. Applicable to custodian service
	 * only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1
	 * RelatedCustodianMessageDetailsSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdCtdnMsgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCustodianMessageDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides selected corporate action events message details extracted from the related custodian messages received. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedCustodianMessageDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RltdCtdnMsgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCustodianMessageDetails";
			definition = "Provides selected corporate action events message details extracted from the related custodian messages received. Applicable to custodian service only.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CustodianDetailsSD1.mmPlaceAndName, CustodianDetailsSD1.mmCustodianCorporateActionRecordIdentification, CustodianDetailsSD1.mmAgreeIndicator,
						CustodianDetailsSD1.mmCompletenessIndicator, CustodianDetailsSD1.mmCustodianActionIndicator, CustodianDetailsSD1.mmGCAActionIndicator, CustodianDetailsSD1.mmReceivingBIC, CustodianDetailsSD1.mmOriginatingBIC,
						CustodianDetailsSD1.mmCompositeNotInSubscriptionFlag, CustodianDetailsSD1.mmRelatedCustodianMessageDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustodianDetailsSD1";
				definition = "Provides information regarding custodian service record.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "CtdnCorpActnRcrdId", required = true)
	public Max35Text getCustodianCorporateActionRecordIdentification() {
		return custodianCorporateActionRecordIdentification;
	}

	public void setCustodianCorporateActionRecordIdentification(Max35Text custodianCorporateActionRecordIdentification) {
		this.custodianCorporateActionRecordIdentification = custodianCorporateActionRecordIdentification;
	}

	@XmlElement(name = "AgrInd", required = true)
	public CustodianRecordAgreementType1Code getAgreeIndicator() {
		return agreeIndicator;
	}

	public void setAgreeIndicator(CustodianRecordAgreementType1Code agreeIndicator) {
		this.agreeIndicator = agreeIndicator;
	}

	@XmlElement(name = "CmpltnsInd", required = true)
	public CustodianRecordCompletenessType1Code getCompletenessIndicator() {
		return completenessIndicator;
	}

	public void setCompletenessIndicator(CustodianRecordCompletenessType1Code completenessIndicator) {
		this.completenessIndicator = completenessIndicator;
	}

	@XmlElement(name = "CtdnActnInd")
	public CustodianAction1Code getCustodianActionIndicator() {
		return custodianActionIndicator;
	}

	public void setCustodianActionIndicator(CustodianAction1Code custodianActionIndicator) {
		this.custodianActionIndicator = custodianActionIndicator;
	}

	@XmlElement(name = "GCAActnInd")
	public GCAActionType1Code getGCAActionIndicator() {
		return gCAActionIndicator;
	}

	public void setGCAActionIndicator(GCAActionType1Code gCAActionIndicator) {
		this.gCAActionIndicator = gCAActionIndicator;
	}

	@XmlElement(name = "RcvgBIC", required = true)
	public AnyBICIdentifier getReceivingBIC() {
		return receivingBIC;
	}

	public void setReceivingBIC(AnyBICIdentifier receivingBIC) {
		this.receivingBIC = receivingBIC;
	}

	@XmlElement(name = "OrgtgBIC", required = true)
	public AnyBICIdentifier getOriginatingBIC() {
		return originatingBIC;
	}

	public void setOriginatingBIC(AnyBICIdentifier originatingBIC) {
		this.originatingBIC = originatingBIC;
	}

	@XmlElement(name = "CmpsitNotInSbcptFlg", required = true)
	public YesNoIndicator getCompositeNotInSubscriptionFlag() {
		return compositeNotInSubscriptionFlag;
	}

	public void setCompositeNotInSubscriptionFlag(YesNoIndicator compositeNotInSubscriptionFlag) {
		this.compositeNotInSubscriptionFlag = compositeNotInSubscriptionFlag;
	}

	@XmlElement(name = "RltdCtdnMsgDtls")
	public List<RelatedCustodianMessageDetailsSD1> getRelatedCustodianMessageDetails() {
		return relatedCustodianMessageDetails;
	}

	public void setRelatedCustodianMessageDetails(List<com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1> relatedCustodianMessageDetails) {
		this.relatedCustodianMessageDetails = relatedCustodianMessageDetails;
	}
}