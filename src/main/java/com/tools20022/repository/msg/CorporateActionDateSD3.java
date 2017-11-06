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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmPlaceAndName
 * CorporateActionDateSD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmDTCLastDayForEarlyRedemption
 * CorporateActionDateSD3.mmDTCLastDayForEarlyRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmDTCPositionCaptureDate
 * CorporateActionDateSD3.mmDTCPositionCaptureDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmNewYorkCutOffDate
 * CorporateActionDateSD3.mmNewYorkCutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmDTCExtendedCutOffDate
 * CorporateActionDateSD3.mmDTCExtendedCutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmEffectiveDateByExchange
 * CorporateActionDateSD3.mmEffectiveDateByExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmDateDeclaredWorthless
 * CorporateActionDateSD3.mmDateDeclaredWorthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmDeleteWorthlessSecurityDate
 * CorporateActionDateSD3.mmDeleteWorthlessSecurityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmDTCExitDate
 * CorporateActionDateSD3.mmDTCExitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmSubscriptionBeginDate
 * CorporateActionDateSD3.mmSubscriptionBeginDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmFilingDate
 * CorporateActionDateSD3.mmFilingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3#mmHearingDate
 * CorporateActionDateSD3.mmHearingDate}</li>
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
 * "CorporateActionDateSD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action date details."</li>
 * </ul>
 */
public class CorporateActionDateSD3 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
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
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ISODate dTCLastDayForEarlyRedemption;
	/**
	 * Last day on which DTC (The Depository Trust Corporation) will accept
	 * instructions for CD early redemptions. This is specific to CDs when the
	 * registered holder is deceased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCLastDayForEarlyRed"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCLastDayForEarlyRedemption = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCLastDayForEarlyRed";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCLastDayForEarlyRedemption";
			definition = "Last day on which DTC (The Depository Trust Corporation) will accept instructions for CD early redemptions. This is specific to CDs when the registered holder is deceased.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate dTCPositionCaptureDate;
	/**
	 * Date when positions are captured and entitlements are calculated in the
	 * system at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPosCaptrDt"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPositionCaptureDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCPosCaptrDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPositionCaptureDate";
			definition = "Date when positions are captured and entitlements are calculated in the system at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate newYorkCutOffDate;
	/**
	 * Last day to deposit securities at DTC and receive the entitlement for an
	 * event approaching record date. Issues that have a New York cut-off date
	 * have an out-of-town agent on DTC's records.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewYorkCutOffDt"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewYorkCutOffDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "NewYorkCutOffDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewYorkCutOffDate";
			definition = "Last day to deposit securities at DTC and receive the entitlement for an event approaching record date. Issues that have a New York cut-off date have an out-of-town agent on DTC's records.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate dTCExtendedCutOffDate;
	/**
	 * Cutoff date for DTC (The Depository Trust Corporation) deposit and
	 * withdrawal activity. Certain events require an earlier cutoff date. This
	 * is typically used on event securities requiring the submission of bearer
	 * coupons. Those events usually stop deposit and withdrawal activity one
	 * month prior to the declared record date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCXtndedCutOffDt"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCExtendedCutOffDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCXtndedCutOffDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCExtendedCutOffDate";
			definition = "Cutoff date for DTC (The Depository Trust Corporation) deposit and withdrawal activity. Certain events require an earlier cutoff date. This is typically used on event securities requiring the submission of bearer coupons. Those events usually stop deposit and withdrawal activity one month prior to the declared record date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate effectiveDateByExchange;
	/**
	 * Effective date as declared by the primary exchange that generally
	 * coincides with cessation of trading in the old security and commencement
	 * of trading in the new security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDtByXchg"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveDateByExchange = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "FctvDtByXchg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateByExchange";
			definition = "Effective date as declared by the primary exchange that generally coincides with cessation of trading in the old security and commencement of trading in the new security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate dateDeclaredWorthless;
	/**
	 * Date that DTC received formal notification from the agent/issuer stating
	 * that the securities are null and void.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDclrdWrthls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDeclaredWorthless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date that DTC received formal notification from the agent/issuer stating that the securities are null and void. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateDeclaredWorthless = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "DtDclrdWrthls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDeclaredWorthless";
			definition = "Date that DTC received formal notification from the agent/issuer stating that the securities are null and void. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate deleteWorthlessSecurityDate;
	/**
	 * Date when DTC participant positions will be deleted. Typically used for
	 * expired rights and warrants.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DelWrthlsSctyDt"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeleteWorthlessSecurityDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "DelWrthlsSctyDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeleteWorthlessSecurityDate";
			definition = "Date when DTC participant positions will be deleted. Typically used for expired rights and warrants.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate dTCExitDate;
	/**
	 * Date on which securities will be exited to DTC participants from DTC (The
	 * Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCExitDt"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCExitDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "DTCExitDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCExitDate";
			definition = "Date on which securities will be exited to DTC participants from DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate subscriptionBeginDate;
	/**
	 * Date on which a holder can begin to subscribe for new/additional shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptBegnDt"</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriptionBeginDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "SbcptBegnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionBeginDate";
			definition = "Date on which a holder can begin to subscribe for new/additional shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate filingDate;
	/**
	 * Date on which a company files a petition for reorganisation under Chapter
	 * 11 of the United States Bankruptcy Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FilgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FilingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a company files a petition for reorganisation under Chapter 11 of the United States Bankruptcy Code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFilingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "FilgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FilingDate";
			definition = "Date on which a company files a petition for reorganisation under Chapter 11 of the United States Bankruptcy Code.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate hearingDate;
	/**
	 * Hearing date as set by the court. Hearing date is material to the
	 * shareholder/interested party as this may be the last opportunity to make
	 * a case against/for a settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD3
	 * CorporateActionDateSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HrgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HearingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hearing date as set by the court. Hearing date is material to the shareholder/interested party as this may be the last opportunity to make a case against/for a settlement. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHearingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD3.mmObject();
			isDerived = false;
			xmlTag = "HrgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HearingDate";
			definition = "Hearing date as set by the court. Hearing date is material to the shareholder/interested party as this may be the last opportunity to make a case against/for a settlement. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDateSD3.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionDateSD3.mmDTCLastDayForEarlyRedemption,
						com.tools20022.repository.msg.CorporateActionDateSD3.mmDTCPositionCaptureDate, com.tools20022.repository.msg.CorporateActionDateSD3.mmNewYorkCutOffDate,
						com.tools20022.repository.msg.CorporateActionDateSD3.mmDTCExtendedCutOffDate, com.tools20022.repository.msg.CorporateActionDateSD3.mmEffectiveDateByExchange,
						com.tools20022.repository.msg.CorporateActionDateSD3.mmDateDeclaredWorthless, com.tools20022.repository.msg.CorporateActionDateSD3.mmDeleteWorthlessSecurityDate,
						com.tools20022.repository.msg.CorporateActionDateSD3.mmDTCExitDate, com.tools20022.repository.msg.CorporateActionDateSD3.mmSubscriptionBeginDate, com.tools20022.repository.msg.CorporateActionDateSD3.mmFilingDate,
						com.tools20022.repository.msg.CorporateActionDateSD3.mmHearingDate);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionDateSD3";
				definition = "Provides additional information regarding corporate action date details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public ISODate getDTCLastDayForEarlyRedemption() {
		return dTCLastDayForEarlyRedemption;
	}

	public void setDTCLastDayForEarlyRedemption(ISODate dTCLastDayForEarlyRedemption) {
		this.dTCLastDayForEarlyRedemption = dTCLastDayForEarlyRedemption;
	}

	public ISODate getDTCPositionCaptureDate() {
		return dTCPositionCaptureDate;
	}

	public void setDTCPositionCaptureDate(ISODate dTCPositionCaptureDate) {
		this.dTCPositionCaptureDate = dTCPositionCaptureDate;
	}

	public ISODate getNewYorkCutOffDate() {
		return newYorkCutOffDate;
	}

	public void setNewYorkCutOffDate(ISODate newYorkCutOffDate) {
		this.newYorkCutOffDate = newYorkCutOffDate;
	}

	public ISODate getDTCExtendedCutOffDate() {
		return dTCExtendedCutOffDate;
	}

	public void setDTCExtendedCutOffDate(ISODate dTCExtendedCutOffDate) {
		this.dTCExtendedCutOffDate = dTCExtendedCutOffDate;
	}

	public ISODate getEffectiveDateByExchange() {
		return effectiveDateByExchange;
	}

	public void setEffectiveDateByExchange(ISODate effectiveDateByExchange) {
		this.effectiveDateByExchange = effectiveDateByExchange;
	}

	public ISODate getDateDeclaredWorthless() {
		return dateDeclaredWorthless;
	}

	public void setDateDeclaredWorthless(ISODate dateDeclaredWorthless) {
		this.dateDeclaredWorthless = dateDeclaredWorthless;
	}

	public ISODate getDeleteWorthlessSecurityDate() {
		return deleteWorthlessSecurityDate;
	}

	public void setDeleteWorthlessSecurityDate(ISODate deleteWorthlessSecurityDate) {
		this.deleteWorthlessSecurityDate = deleteWorthlessSecurityDate;
	}

	public ISODate getDTCExitDate() {
		return dTCExitDate;
	}

	public void setDTCExitDate(ISODate dTCExitDate) {
		this.dTCExitDate = dTCExitDate;
	}

	public ISODate getSubscriptionBeginDate() {
		return subscriptionBeginDate;
	}

	public void setSubscriptionBeginDate(ISODate subscriptionBeginDate) {
		this.subscriptionBeginDate = subscriptionBeginDate;
	}

	public ISODate getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(ISODate filingDate) {
		this.filingDate = filingDate;
	}

	public ISODate getHearingDate() {
		return hearingDate;
	}

	public void setHearingDate(ISODate hearingDate) {
		this.hearingDate = hearingDate;
	}
}