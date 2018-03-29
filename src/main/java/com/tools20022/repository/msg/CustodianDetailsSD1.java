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

import com.tools20022.metamodel.ext.DTCCSynonym;
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
import com.tools20022.repository.msg.RelatedCustodianMessageDetailsSD1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustodianDetailsSD1", propOrder = {"placeAndName", "custodianCorporateActionRecordIdentification", "agreeIndicator", "completenessIndicator", "custodianActionIndicator", "gCAActionIndicator", "receivingBIC",
		"originatingBIC", "compositeNotInSubscriptionFlag", "relatedCustodianMessageDetails"})
public class CustodianDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CustodianDetailsSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<CustodianDetailsSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CustodianDetailsSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "CtdnCorpActnRcrdId", required = true)
	protected Max35Text custodianCorporateActionRecordIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnCorpActnRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Custodian CA ID</li>
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
	public static final MMMessageAttribute<CustodianDetailsSD1, Max35Text> mmCustodianCorporateActionRecordIdentification = new MMMessageAttribute<CustodianDetailsSD1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CtdnCorpActnRcrdId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Custodian CA ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianCorporateActionRecordIdentification";
			definition = "Unique identifier of a custodian corporate action record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CustodianDetailsSD1 obj) {
			return obj.getCustodianCorporateActionRecordIdentification();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, Max35Text value) {
			obj.setCustodianCorporateActionRecordIdentification(value);
		}
	};
	@XmlElement(name = "AgrInd", required = true)
	protected CustodianRecordAgreementType1Code agreeIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agrees Indicator</li>
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
	public static final MMMessageAttribute<CustodianDetailsSD1, CustodianRecordAgreementType1Code> mmAgreeIndicator = new MMMessageAttribute<CustodianDetailsSD1, CustodianRecordAgreementType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "AgrInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agrees Indicator "));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreeIndicator";
			definition = "Indicates the state of the agreement of the custodian record when compared to composite record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustodianRecordAgreementType1Code.mmObject();
		}

		@Override
		public CustodianRecordAgreementType1Code getValue(CustodianDetailsSD1 obj) {
			return obj.getAgreeIndicator();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, CustodianRecordAgreementType1Code value) {
			obj.setAgreeIndicator(value);
		}
	};
	@XmlElement(name = "CmpltnsInd", required = true)
	protected CustodianRecordCompletenessType1Code completenessIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Completeness Indicator</li>
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
	public static final MMMessageAttribute<CustodianDetailsSD1, CustodianRecordCompletenessType1Code> mmCompletenessIndicator = new MMMessageAttribute<CustodianDetailsSD1, CustodianRecordCompletenessType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CmpltnsInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Completeness Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletenessIndicator";
			definition = "Indicates state of the details of the custodian record on the system. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CustodianRecordCompletenessType1Code.mmObject();
		}

		@Override
		public CustodianRecordCompletenessType1Code getValue(CustodianDetailsSD1 obj) {
			return obj.getCompletenessIndicator();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, CustodianRecordCompletenessType1Code value) {
			obj.setCompletenessIndicator(value);
		}
	};
	@XmlElement(name = "CtdnActnInd")
	protected CustodianAction1Code custodianActionIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Custodian Action Indicator</li>
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
	public static final MMMessageAttribute<CustodianDetailsSD1, Optional<CustodianAction1Code>> mmCustodianActionIndicator = new MMMessageAttribute<CustodianDetailsSD1, Optional<CustodianAction1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CtdnActnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Custodian Action Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianActionIndicator";
			definition = "Represents the status of custodian activity when applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CustodianAction1Code.mmObject();
		}

		@Override
		public Optional<CustodianAction1Code> getValue(CustodianDetailsSD1 obj) {
			return obj.getCustodianActionIndicator();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, Optional<CustodianAction1Code> value) {
			obj.setCustodianActionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "GCAActnInd")
	protected GCAActionType1Code gCAActionIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: GCA Action Indicator</li>
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
	public static final MMMessageAttribute<CustodianDetailsSD1, Optional<GCAActionType1Code>> mmGCAActionIndicator = new MMMessageAttribute<CustodianDetailsSD1, Optional<GCAActionType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "GCAActnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "GCA Action Indicator "));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GCAActionIndicator";
			definition = "Indicates what action needs to be taken by the GCA (Global Corporate Action) validation service for this particular record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GCAActionType1Code.mmObject();
		}

		@Override
		public Optional<GCAActionType1Code> getValue(CustodianDetailsSD1 obj) {
			return obj.getGCAActionIndicator();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, Optional<GCAActionType1Code> value) {
			obj.setGCAActionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgBIC", required = true)
	protected AnyBICIdentifier receivingBIC;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Receiving BIC Code</li>
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
	public static final MMMessageAttribute<CustodianDetailsSD1, AnyBICIdentifier> mmReceivingBIC = new MMMessageAttribute<CustodianDetailsSD1, AnyBICIdentifier>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RcvgBIC";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Receiving BIC Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingBIC";
			definition = "BIC which is configured as a recipient of the custodian record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(CustodianDetailsSD1 obj) {
			return obj.getReceivingBIC();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, AnyBICIdentifier value) {
			obj.setReceivingBIC(value);
		}
	};
	@XmlElement(name = "OrgtgBIC", required = true)
	protected AnyBICIdentifier originatingBIC;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Originating BIC Code</li>
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
	public static final MMMessageAttribute<CustodianDetailsSD1, AnyBICIdentifier> mmOriginatingBIC = new MMMessageAttribute<CustodianDetailsSD1, AnyBICIdentifier>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OrgtgBIC";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Originating BIC Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingBIC";
			definition = "BIC which is configured as a sender of the custodian record. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(CustodianDetailsSD1 obj) {
			return obj.getOriginatingBIC();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, AnyBICIdentifier value) {
			obj.setOriginatingBIC(value);
		}
	};
	@XmlElement(name = "CmpsitNotInSbcptFlg", required = true)
	protected YesNoIndicator compositeNotInSubscriptionFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CustodianDetailsSD1
	 * CustodianDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpsitNotInSbcptFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Composite not in Subscription Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompositeNotInSubscriptionFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event security of the corresponding composite record is on SOI (security of interest) subscription. Applicable to custodian service only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustodianDetailsSD1, YesNoIndicator> mmCompositeNotInSubscriptionFlag = new MMMessageAttribute<CustodianDetailsSD1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CmpsitNotInSbcptFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Composite not in Subscription Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompositeNotInSubscriptionFlag";
			definition = "Indicates whether the event security of the corresponding composite record is on SOI (security of interest) subscription. Applicable to custodian service only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustodianDetailsSD1 obj) {
			return obj.getCompositeNotInSubscriptionFlag();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, YesNoIndicator value) {
			obj.setCompositeNotInSubscriptionFlag(value);
		}
	};
	@XmlElement(name = "RltdCtdnMsgDtls")
	protected List<RelatedCustodianMessageDetailsSD1> relatedCustodianMessageDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Related Custodian Message Details</li>
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
	public static final MMMessageAssociationEnd<CustodianDetailsSD1, List<RelatedCustodianMessageDetailsSD1>> mmRelatedCustodianMessageDetails = new MMMessageAssociationEnd<CustodianDetailsSD1, List<RelatedCustodianMessageDetailsSD1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustodianDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RltdCtdnMsgDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Related Custodian Message Details"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCustodianMessageDetails";
			definition = "Provides selected corporate action events message details extracted from the related custodian messages received. Applicable to custodian service only.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RelatedCustodianMessageDetailsSD1.mmObject();
		}

		@Override
		public List<RelatedCustodianMessageDetailsSD1> getValue(CustodianDetailsSD1 obj) {
			return obj.getRelatedCustodianMessageDetails();
		}

		@Override
		public void setValue(CustodianDetailsSD1 obj, List<RelatedCustodianMessageDetailsSD1> value) {
			obj.setRelatedCustodianMessageDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustodianDetailsSD1.mmPlaceAndName, com.tools20022.repository.msg.CustodianDetailsSD1.mmCustodianCorporateActionRecordIdentification,
						com.tools20022.repository.msg.CustodianDetailsSD1.mmAgreeIndicator, com.tools20022.repository.msg.CustodianDetailsSD1.mmCompletenessIndicator,
						com.tools20022.repository.msg.CustodianDetailsSD1.mmCustodianActionIndicator, com.tools20022.repository.msg.CustodianDetailsSD1.mmGCAActionIndicator, com.tools20022.repository.msg.CustodianDetailsSD1.mmReceivingBIC,
						com.tools20022.repository.msg.CustodianDetailsSD1.mmOriginatingBIC, com.tools20022.repository.msg.CustodianDetailsSD1.mmCompositeNotInSubscriptionFlag,
						com.tools20022.repository.msg.CustodianDetailsSD1.mmRelatedCustodianMessageDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustodianDetailsSD1";
				definition = "Provides information regarding custodian service record.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CustodianDetailsSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Max35Text getCustodianCorporateActionRecordIdentification() {
		return custodianCorporateActionRecordIdentification;
	}

	public CustodianDetailsSD1 setCustodianCorporateActionRecordIdentification(Max35Text custodianCorporateActionRecordIdentification) {
		this.custodianCorporateActionRecordIdentification = Objects.requireNonNull(custodianCorporateActionRecordIdentification);
		return this;
	}

	public CustodianRecordAgreementType1Code getAgreeIndicator() {
		return agreeIndicator;
	}

	public CustodianDetailsSD1 setAgreeIndicator(CustodianRecordAgreementType1Code agreeIndicator) {
		this.agreeIndicator = Objects.requireNonNull(agreeIndicator);
		return this;
	}

	public CustodianRecordCompletenessType1Code getCompletenessIndicator() {
		return completenessIndicator;
	}

	public CustodianDetailsSD1 setCompletenessIndicator(CustodianRecordCompletenessType1Code completenessIndicator) {
		this.completenessIndicator = Objects.requireNonNull(completenessIndicator);
		return this;
	}

	public Optional<CustodianAction1Code> getCustodianActionIndicator() {
		return custodianActionIndicator == null ? Optional.empty() : Optional.of(custodianActionIndicator);
	}

	public CustodianDetailsSD1 setCustodianActionIndicator(CustodianAction1Code custodianActionIndicator) {
		this.custodianActionIndicator = custodianActionIndicator;
		return this;
	}

	public Optional<GCAActionType1Code> getGCAActionIndicator() {
		return gCAActionIndicator == null ? Optional.empty() : Optional.of(gCAActionIndicator);
	}

	public CustodianDetailsSD1 setGCAActionIndicator(GCAActionType1Code gCAActionIndicator) {
		this.gCAActionIndicator = gCAActionIndicator;
		return this;
	}

	public AnyBICIdentifier getReceivingBIC() {
		return receivingBIC;
	}

	public CustodianDetailsSD1 setReceivingBIC(AnyBICIdentifier receivingBIC) {
		this.receivingBIC = Objects.requireNonNull(receivingBIC);
		return this;
	}

	public AnyBICIdentifier getOriginatingBIC() {
		return originatingBIC;
	}

	public CustodianDetailsSD1 setOriginatingBIC(AnyBICIdentifier originatingBIC) {
		this.originatingBIC = Objects.requireNonNull(originatingBIC);
		return this;
	}

	public YesNoIndicator getCompositeNotInSubscriptionFlag() {
		return compositeNotInSubscriptionFlag;
	}

	public CustodianDetailsSD1 setCompositeNotInSubscriptionFlag(YesNoIndicator compositeNotInSubscriptionFlag) {
		this.compositeNotInSubscriptionFlag = Objects.requireNonNull(compositeNotInSubscriptionFlag);
		return this;
	}

	public List<RelatedCustodianMessageDetailsSD1> getRelatedCustodianMessageDetails() {
		return relatedCustodianMessageDetails == null ? relatedCustodianMessageDetails = new ArrayList<>() : relatedCustodianMessageDetails;
	}

	public CustodianDetailsSD1 setRelatedCustodianMessageDetails(List<RelatedCustodianMessageDetailsSD1> relatedCustodianMessageDetails) {
		this.relatedCustodianMessageDetails = Objects.requireNonNull(relatedCustodianMessageDetails);
		return this;
	}
}