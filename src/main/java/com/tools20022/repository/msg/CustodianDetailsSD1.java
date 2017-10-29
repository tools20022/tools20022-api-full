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
import com.tools20022.repository.codeset.CustodianAction1Code;
import com.tools20022.repository.codeset.CustodianRecordAgreementType1Code;
import com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code;
import com.tools20022.repository.codeset.GCAActionType1Code;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#PlaceAndName
 * CustodianDetailsSD1.PlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#CustodianCorporateActionRecordIdentification
 * CustodianDetailsSD1.CustodianCorporateActionRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#AgreeIndicator
 * CustodianDetailsSD1.AgreeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#CompletenessIndicator
 * CustodianDetailsSD1.CompletenessIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#CustodianActionIndicator
 * CustodianDetailsSD1.CustodianActionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#GCAActionIndicator
 * CustodianDetailsSD1.GCAActionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#ReceivingBIC
 * CustodianDetailsSD1.ReceivingBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#OriginatingBIC
 * CustodianDetailsSD1.OriginatingBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#CompositeNotInSubscriptionFlag
 * CustodianDetailsSD1.CompositeNotInSubscriptionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1#RelatedCustodianMessageDetails
 * CustodianDetailsSD1.RelatedCustodianMessageDetails}</li>
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
 * "CustodianDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information regarding custodian service record."</li>
 * </ul>
 */
public class CustodianDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	public static final MMMessageAttribute CustodianCorporateActionRecordIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CtdnCorpActnRcrdId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianCorporateActionRecordIdentification";
			definition = "Unique identifier of a custodian corporate action record. Applicable to custodian service only.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMMessageAttribute AgreeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "AgrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreeIndicator";
			definition = "Indicates the state of the agreement of the custodian record when compared to composite record. Applicable to custodian service only.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CustodianRecordAgreementType1Code.mmObject();
		}
	};
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
	public static final MMMessageAttribute CompletenessIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CmpltnsInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletenessIndicator";
			definition = "Indicates state of the details of the custodian record on the system. Applicable to custodian service only.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CustodianRecordCompletenessType1Code.mmObject();
		}
	};
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
	public static final MMMessageAttribute CustodianActionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CtdnActnInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianActionIndicator";
			definition = "Represents the status of custodian activity when applicable.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CustodianAction1Code.mmObject();
		}
	};
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
	public static final MMMessageAttribute GCAActionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "GCAActnInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GCAActionIndicator";
			definition = "Indicates what action needs to be taken by the GCA (Global Corporate Action) validation service for this particular record. Applicable to custodian service only.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> GCAActionType1Code.mmObject();
		}
	};
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
	public static final MMMessageAttribute ReceivingBIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvgBIC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingBIC";
			definition = "BIC which is configured as a recipient of the custodian record. Applicable to custodian service only.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
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
	public static final MMMessageAttribute OriginatingBIC = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OrgtgBIC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingBIC";
			definition = "BIC which is configured as a sender of the custodian record. Applicable to custodian service only.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
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
	public static final MMMessageAttribute CompositeNotInSubscriptionFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CmpsitNotInSbcptFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompositeNotInSubscriptionFlag";
			definition = "Indicates whether the event security of the  corresponding composite record is on SOI (security of interest) subscription. Applicable to custodian service only.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMMessageAssociationEnd RelatedCustodianMessageDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RltdCtdnMsgDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCustodianMessageDetails";
			definition = "Provides selected corporate action events message details extracted from the related custodian messages received. Applicable to custodian service only.";
			minOccurs = 0;
			type_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustodianDetailsSD1.PlaceAndName, com.tools20022.repository.msg.CustodianDetailsSD1.CustodianCorporateActionRecordIdentification,
						com.tools20022.repository.msg.CustodianDetailsSD1.AgreeIndicator, com.tools20022.repository.msg.CustodianDetailsSD1.CompletenessIndicator, com.tools20022.repository.msg.CustodianDetailsSD1.CustodianActionIndicator,
						com.tools20022.repository.msg.CustodianDetailsSD1.GCAActionIndicator, com.tools20022.repository.msg.CustodianDetailsSD1.ReceivingBIC, com.tools20022.repository.msg.CustodianDetailsSD1.OriginatingBIC,
						com.tools20022.repository.msg.CustodianDetailsSD1.CompositeNotInSubscriptionFlag, com.tools20022.repository.msg.CustodianDetailsSD1.RelatedCustodianMessageDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustodianDetailsSD1";
				definition = "Provides information regarding custodian service record.";
			}
		});
		return mmObject_lazy.get();
	}
}