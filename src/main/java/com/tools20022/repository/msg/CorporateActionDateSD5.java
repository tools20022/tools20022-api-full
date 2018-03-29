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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action date details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmPlaceAndName
 * CorporateActionDateSD5.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmDTCLastDayForEarlyRedemption
 * CorporateActionDateSD5.mmDTCLastDayForEarlyRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmDTCPositionCaptureDate
 * CorporateActionDateSD5.mmDTCPositionCaptureDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmNewYorkCutOffDate
 * CorporateActionDateSD5.mmNewYorkCutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmDTCExtendedCutOffDate
 * CorporateActionDateSD5.mmDTCExtendedCutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmEffectiveDateByExchange
 * CorporateActionDateSD5.mmEffectiveDateByExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmDateDeclaredWorthless
 * CorporateActionDateSD5.mmDateDeclaredWorthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmDeleteWorthlessSecurityDate
 * CorporateActionDateSD5.mmDeleteWorthlessSecurityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmDTCExitDate
 * CorporateActionDateSD5.mmDTCExitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5#mmSubscriptionBeginDate
 * CorporateActionDateSD5.mmSubscriptionBeginDate}</li>
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
 * "CorporateActionDateSD5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action date details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDateSD8
 * CorporateActionDateSD8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDateSD5", propOrder = {"placeAndName", "dTCLastDayForEarlyRedemption", "dTCPositionCaptureDate", "newYorkCutOffDate", "dTCExtendedCutOffDate", "effectiveDateByExchange", "dateDeclaredWorthless",
		"deleteWorthlessSecurityDate", "dTCExitDate", "subscriptionBeginDate"})
public class CorporateActionDateSD5 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmPlaceAndName
	 * CorporateActionDateSD8.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionDateSD5, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionDateSD5 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "DTCLastDayForEarlyRed")
	protected ISODate dTCLastDayForEarlyRedemption;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCLastDayForEarlyRed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Last Day for Early Redemption</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCLastDayForEarlyRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day on which DTC (The Depository Trust Corporation) will accept instructions for CD early redemptions. This is specific to CDs when the registered holder is deceased."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmDTCLastDayForEarlyRedemption
	 * CorporateActionDateSD8.mmDTCLastDayForEarlyRedemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>> mmDTCLastDayForEarlyRedemption = new MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "DTCLastDayForEarlyRed";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Last Day for Early Redemption"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCLastDayForEarlyRedemption";
			definition = "Last day on which DTC (The Depository Trust Corporation) will accept instructions for CD early redemptions. This is specific to CDs when the registered holder is deceased.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmDTCLastDayForEarlyRedemption);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionDateSD5 obj) {
			return obj.getDTCLastDayForEarlyRedemption();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Optional<ISODate> value) {
			obj.setDTCLastDayForEarlyRedemption(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCPosCaptrDt")
	protected ISODate dTCPositionCaptureDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPosCaptrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Position Capture Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPositionCaptureDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when positions are captured and entitlements are calculated in the system at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmDTCPositionCaptureDate
	 * CorporateActionDateSD8.mmDTCPositionCaptureDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>> mmDTCPositionCaptureDate = new MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "DTCPosCaptrDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Position Capture Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPositionCaptureDate";
			definition = "Date when positions are captured and entitlements are calculated in the system at DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmDTCPositionCaptureDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionDateSD5 obj) {
			return obj.getDTCPositionCaptureDate();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Optional<ISODate> value) {
			obj.setDTCPositionCaptureDate(value.orElse(null));
		}
	};
	@XmlElement(name = "NewYorkCutOffDt")
	protected ISODate newYorkCutOffDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewYorkCutOffDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: New York Cut-Off Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewYorkCutOffDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day to deposit securities at DTC and receive the entitlement for an event approaching record date. Issues that have a New York cut-off date have an out-of-town agent on DTC's records."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmNewYorkCutOffDate
	 * CorporateActionDateSD8.mmNewYorkCutOffDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>> mmNewYorkCutOffDate = new MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "NewYorkCutOffDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "New York Cut-Off Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewYorkCutOffDate";
			definition = "Last day to deposit securities at DTC and receive the entitlement for an event approaching record date. Issues that have a New York cut-off date have an out-of-town agent on DTC's records.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmNewYorkCutOffDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionDateSD5 obj) {
			return obj.getNewYorkCutOffDate();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Optional<ISODate> value) {
			obj.setNewYorkCutOffDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCXtndedCutOffDt")
	protected ISODate dTCExtendedCutOffDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCXtndedCutOffDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Extended Cut-Off Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCExtendedCutOffDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cutoff date for DTC (The Depository Trust Corporation) deposit and withdrawal activity. Certain events require an earlier cutoff date. This is typically used on event securities requiring the submission of bearer coupons. Those events usually stop deposit and withdrawal activity one month prior to the declared record date."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmDTCExtendedCutOffDate
	 * CorporateActionDateSD8.mmDTCExtendedCutOffDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>> mmDTCExtendedCutOffDate = new MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "DTCXtndedCutOffDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Extended Cut-Off Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCExtendedCutOffDate";
			definition = "Cutoff date for DTC (The Depository Trust Corporation) deposit and withdrawal activity. Certain events require an earlier cutoff date. This is typically used on event securities requiring the submission of bearer coupons. Those events usually stop deposit and withdrawal activity one month prior to the declared record date.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmDTCExtendedCutOffDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionDateSD5 obj) {
			return obj.getDTCExtendedCutOffDate();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Optional<ISODate> value) {
			obj.setDTCExtendedCutOffDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvDtByXchg")
	protected ISODate effectiveDateByExchange;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDtByXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Effective Date (Exchange)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateByExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date as declared by the primary exchange that generally coincides with cessation of trading in the old security and commencement of trading in the new security."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmEffectiveDateByExchange
	 * CorporateActionDateSD8.mmEffectiveDateByExchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>> mmEffectiveDateByExchange = new MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "FctvDtByXchg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Effective Date (Exchange)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateByExchange";
			definition = "Effective date as declared by the primary exchange that generally coincides with cessation of trading in the old security and commencement of trading in the new security.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmEffectiveDateByExchange);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionDateSD5 obj) {
			return obj.getEffectiveDateByExchange();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Optional<ISODate> value) {
			obj.setEffectiveDateByExchange(value.orElse(null));
		}
	};
	@XmlElement(name = "DtDclrdWrthls")
	protected ISODate dateDeclaredWorthless;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDclrdWrthls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Date Declared Worthless</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDeclaredWorthless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date that DTC received formal notification from the agent/issuer stating that the securities are null and void."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmDateDeclaredWorthless
	 * CorporateActionDateSD8.mmDateDeclaredWorthless}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>> mmDateDeclaredWorthless = new MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "DtDclrdWrthls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Date Declared Worthless"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDeclaredWorthless";
			definition = "Date that DTC received formal notification from the agent/issuer stating that the securities are null and void.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmDateDeclaredWorthless);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionDateSD5 obj) {
			return obj.getDateDeclaredWorthless();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Optional<ISODate> value) {
			obj.setDateDeclaredWorthless(value.orElse(null));
		}
	};
	@XmlElement(name = "DelWrthlsSctyDt")
	protected ISODate deleteWorthlessSecurityDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DelWrthlsSctyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Delete Worthless Security Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeleteWorthlessSecurityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when DTC participant positions will be deleted. Typically used for expired rights and warrants."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmDeleteWorthlessSecurityDate
	 * CorporateActionDateSD8.mmDeleteWorthlessSecurityDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>> mmDeleteWorthlessSecurityDate = new MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "DelWrthlsSctyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Delete Worthless Security Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeleteWorthlessSecurityDate";
			definition = "Date when DTC participant positions will be deleted. Typically used for expired rights and warrants.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmDeleteWorthlessSecurityDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionDateSD5 obj) {
			return obj.getDeleteWorthlessSecurityDate();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Optional<ISODate> value) {
			obj.setDeleteWorthlessSecurityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCExitDt")
	protected ISODate dTCExitDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCExitDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Exit Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCExitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which securities will be exited to DTC participants from DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmDTCExitDate
	 * CorporateActionDateSD8.mmDTCExitDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>> mmDTCExitDate = new MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "DTCExitDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Exit Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCExitDate";
			definition = "Date on which securities will be exited to DTC participants from DTC (The Depository Trust Corporation).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmDTCExitDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionDateSD5 obj) {
			return obj.getDTCExitDate();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Optional<ISODate> value) {
			obj.setDTCExitDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcptBegnDt")
	protected ISODate subscriptionBeginDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD5
	 * CorporateActionDateSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptBegnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Subscription Begin Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionBeginDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a holder can begin to subscribe for new/additional shares."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD8#mmSubscriptionBeginDate
	 * CorporateActionDateSD8.mmSubscriptionBeginDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>> mmSubscriptionBeginDate = new MMMessageAttribute<CorporateActionDateSD5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD5.mmObject();
			isDerived = false;
			xmlTag = "SbcptBegnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Subscription Begin Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionBeginDate";
			definition = "Date on which a holder can begin to subscribe for new/additional shares.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmSubscriptionBeginDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionDateSD5 obj) {
			return obj.getSubscriptionBeginDate();
		}

		@Override
		public void setValue(CorporateActionDateSD5 obj, Optional<ISODate> value) {
			obj.setSubscriptionBeginDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDateSD5.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionDateSD5.mmDTCLastDayForEarlyRedemption,
						com.tools20022.repository.msg.CorporateActionDateSD5.mmDTCPositionCaptureDate, com.tools20022.repository.msg.CorporateActionDateSD5.mmNewYorkCutOffDate,
						com.tools20022.repository.msg.CorporateActionDateSD5.mmDTCExtendedCutOffDate, com.tools20022.repository.msg.CorporateActionDateSD5.mmEffectiveDateByExchange,
						com.tools20022.repository.msg.CorporateActionDateSD5.mmDateDeclaredWorthless, com.tools20022.repository.msg.CorporateActionDateSD5.mmDeleteWorthlessSecurityDate,
						com.tools20022.repository.msg.CorporateActionDateSD5.mmDTCExitDate, com.tools20022.repository.msg.CorporateActionDateSD5.mmSubscriptionBeginDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDateSD5";
				definition = "Provides additional information regarding corporate action date details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionDateSD5 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<ISODate> getDTCLastDayForEarlyRedemption() {
		return dTCLastDayForEarlyRedemption == null ? Optional.empty() : Optional.of(dTCLastDayForEarlyRedemption);
	}

	public CorporateActionDateSD5 setDTCLastDayForEarlyRedemption(ISODate dTCLastDayForEarlyRedemption) {
		this.dTCLastDayForEarlyRedemption = dTCLastDayForEarlyRedemption;
		return this;
	}

	public Optional<ISODate> getDTCPositionCaptureDate() {
		return dTCPositionCaptureDate == null ? Optional.empty() : Optional.of(dTCPositionCaptureDate);
	}

	public CorporateActionDateSD5 setDTCPositionCaptureDate(ISODate dTCPositionCaptureDate) {
		this.dTCPositionCaptureDate = dTCPositionCaptureDate;
		return this;
	}

	public Optional<ISODate> getNewYorkCutOffDate() {
		return newYorkCutOffDate == null ? Optional.empty() : Optional.of(newYorkCutOffDate);
	}

	public CorporateActionDateSD5 setNewYorkCutOffDate(ISODate newYorkCutOffDate) {
		this.newYorkCutOffDate = newYorkCutOffDate;
		return this;
	}

	public Optional<ISODate> getDTCExtendedCutOffDate() {
		return dTCExtendedCutOffDate == null ? Optional.empty() : Optional.of(dTCExtendedCutOffDate);
	}

	public CorporateActionDateSD5 setDTCExtendedCutOffDate(ISODate dTCExtendedCutOffDate) {
		this.dTCExtendedCutOffDate = dTCExtendedCutOffDate;
		return this;
	}

	public Optional<ISODate> getEffectiveDateByExchange() {
		return effectiveDateByExchange == null ? Optional.empty() : Optional.of(effectiveDateByExchange);
	}

	public CorporateActionDateSD5 setEffectiveDateByExchange(ISODate effectiveDateByExchange) {
		this.effectiveDateByExchange = effectiveDateByExchange;
		return this;
	}

	public Optional<ISODate> getDateDeclaredWorthless() {
		return dateDeclaredWorthless == null ? Optional.empty() : Optional.of(dateDeclaredWorthless);
	}

	public CorporateActionDateSD5 setDateDeclaredWorthless(ISODate dateDeclaredWorthless) {
		this.dateDeclaredWorthless = dateDeclaredWorthless;
		return this;
	}

	public Optional<ISODate> getDeleteWorthlessSecurityDate() {
		return deleteWorthlessSecurityDate == null ? Optional.empty() : Optional.of(deleteWorthlessSecurityDate);
	}

	public CorporateActionDateSD5 setDeleteWorthlessSecurityDate(ISODate deleteWorthlessSecurityDate) {
		this.deleteWorthlessSecurityDate = deleteWorthlessSecurityDate;
		return this;
	}

	public Optional<ISODate> getDTCExitDate() {
		return dTCExitDate == null ? Optional.empty() : Optional.of(dTCExitDate);
	}

	public CorporateActionDateSD5 setDTCExitDate(ISODate dTCExitDate) {
		this.dTCExitDate = dTCExitDate;
		return this;
	}

	public Optional<ISODate> getSubscriptionBeginDate() {
		return subscriptionBeginDate == null ? Optional.empty() : Optional.of(subscriptionBeginDate);
	}

	public CorporateActionDateSD5 setSubscriptionBeginDate(ISODate subscriptionBeginDate) {
		this.subscriptionBeginDate = subscriptionBeginDate;
		return this;
	}
}