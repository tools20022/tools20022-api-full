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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PartyIdentificationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies an alternative identification of a trading party, for example,
 * trader code, trader name, short legal name of firm and so on.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#FXMemberID
 * PartyIdentificationType1Code.FXMemberID}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#FXSystemEnglishShortName
 * PartyIdentificationType1Code.FXSystemEnglishShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#InstitutionGroupName
 * PartyIdentificationType1Code.InstitutionGroupName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#InstitutionIdentificationInComStarSystem
 * PartyIdentificationType1Code.InstitutionIdentificationInComStarSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#InternalGroupTheTraderBelongedTo
 * PartyIdentificationType1Code.InternalGroupTheTraderBelongedTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#MarketMaker
 * PartyIdentificationType1Code.MarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#MembersOrClients
 * PartyIdentificationType1Code.MembersOrClients}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#MemberType
 * PartyIdentificationType1Code.MemberType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#NonMarketMaker
 * PartyIdentificationType1Code.NonMarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#OtherSystemCode
 * PartyIdentificationType1Code.OtherSystemCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#Password
 * PartyIdentificationType1Code.Password}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#PhoneNumber
 * PartyIdentificationType1Code.PhoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#PostalAddress
 * PartyIdentificationType1Code.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#RMBMemberIdentification
 * PartyIdentificationType1Code.RMBMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#ShortLegalChineseNameOfFirm
 * PartyIdentificationType1Code.ShortLegalChineseNameOfFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#ShortLegalNameOfFirm
 * PartyIdentificationType1Code.ShortLegalNameOfFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#TraderChineseName
 * PartyIdentificationType1Code.TraderChineseName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#TraderCode
 * PartyIdentificationType1Code.TraderCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#TraderName
 * PartyIdentificationType1Code.TraderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#UserInputTrades
 * PartyIdentificationType1Code.UserInputTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#UserName
 * PartyIdentificationType1Code.UserName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#AgentUserInputTrades
 * PartyIdentificationType1Code.AgentUserInputTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#BranchIdentification
 * PartyIdentificationType1Code.BranchIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#ClearingInstitution
 * PartyIdentificationType1Code.ClearingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#CollateralManagementInstitution
 * PartyIdentificationType1Code.CollateralManagementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#CollateralManagementInstitutionName
 * PartyIdentificationType1Code.CollateralManagementInstitutionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#ContactMethodOfTrader
 * PartyIdentificationType1Code.ContactMethodOfTrader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#ContactName
 * PartyIdentificationType1Code.ContactName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#CustodyManagementInstitution
 * PartyIdentificationType1Code.CustodyManagementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#DealConfirmContactName
 * PartyIdentificationType1Code.DealConfirmContactName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#Department
 * PartyIdentificationType1Code.Department}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#EligibleCounterparty
 * PartyIdentificationType1Code.EligibleCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#ExecutionVenue
 * PartyIdentificationType1Code.ExecutionVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#FirmCode
 * PartyIdentificationType1Code.FirmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#FirmIdentification
 * PartyIdentificationType1Code.FirmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#FullLegalChineseNameOfFirm
 * PartyIdentificationType1Code.FullLegalChineseNameOfFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code#FullLegalNameOfFirm
 * PartyIdentificationType1Code.FullLegalNameOfFirm}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
 * PartyIdentificationTypeCode}</li>
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
 * "PartyIdentificationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an alternative identification of a trading party, for example, trader code, trader name, short legal name of firm and so on."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyIdentificationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXMemberID"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code FXMemberID = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXMemberID";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.FXMemberID.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXSystemEnglishShortName"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code FXSystemEnglishShortName = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXSystemEnglishShortName";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.FXSystemEnglishShortName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionGroupName"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code InstitutionGroupName = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionGroupName";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.InstitutionGroupName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionIdentificationInComStarSystem"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code InstitutionIdentificationInComStarSystem = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionIdentificationInComStarSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.InstitutionIdentificationInComStarSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalGroupTheTraderBelongedTo"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code InternalGroupTheTraderBelongedTo = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalGroupTheTraderBelongedTo";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.InternalGroupTheTraderBelongedTo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code MarketMaker = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMaker";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.MarketMaker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MembersOrClients"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code MembersOrClients = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MembersOrClients";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.MembersOrClients.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberType"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code MemberType = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberType";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.MemberType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonMarketMaker"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code NonMarketMaker = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonMarketMaker";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.NonMarketMaker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherSystemCode"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code OtherSystemCode = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherSystemCode";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.OtherSystemCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code Password = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.Password.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNumber"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code PhoneNumber = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.PhoneNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code PostalAddress = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.PostalAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RMBMemberIdentification"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code RMBMemberIdentification = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RMBMemberIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.RMBMemberIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLegalChineseNameOfFirm"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code ShortLegalChineseNameOfFirm = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLegalChineseNameOfFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.ShortLegalChineseNameOfFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLegalNameOfFirm"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code ShortLegalNameOfFirm = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLegalNameOfFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.ShortLegalNameOfFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraderChineseName"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code TraderChineseName = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraderChineseName";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.TraderChineseName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraderCode"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code TraderCode = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraderCode";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.TraderCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraderName"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code TraderName = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraderName";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.TraderName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserInputTrades"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code UserInputTrades = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserInputTrades";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.UserInputTrades.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserName"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code UserName = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserName";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.UserName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentUserInputTrades"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code AgentUserInputTrades = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentUserInputTrades";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.AgentUserInputTrades.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BranchIdentification"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code BranchIdentification = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.BranchIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingInstitution"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code ClearingInstitution = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.ClearingInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagementInstitution"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code CollateralManagementInstitution = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagementInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.CollateralManagementInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagementInstitutionName"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code CollateralManagementInstitutionName = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagementInstitutionName";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.CollateralManagementInstitutionName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactMethodOfTrader"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code ContactMethodOfTrader = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactMethodOfTrader";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.ContactMethodOfTrader.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactName"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code ContactName = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactName";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.ContactName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyManagementInstitution"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code CustodyManagementInstitution = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyManagementInstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.CustodyManagementInstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealConfirmContactName"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code DealConfirmContactName = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealConfirmContactName";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.DealConfirmContactName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Department"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code Department = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Department";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.Department.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCounterparty"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code EligibleCounterparty = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.EligibleCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionVenue"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code ExecutionVenue = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionVenue";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.ExecutionVenue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmCode"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code FirmCode = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmCode";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.FirmCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmIdentification"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code FirmIdentification = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.FirmIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullLegalChineseNameOfFirm"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code FullLegalChineseNameOfFirm = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullLegalChineseNameOfFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.FullLegalChineseNameOfFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
	 * PartyIdentificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullLegalNameOfFirm"</li>
	 * </ul>
	 */
	public static final PartyIdentificationType1Code FullLegalNameOfFirm = new PartyIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullLegalNameOfFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIdentificationType1Code.mmObject();
			codeName = PartyIdentificationTypeCode.FullLegalNameOfFirm.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartyIdentificationType1Code> codesByName = new LinkedHashMap<>();

	protected PartyIdentificationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationType1Code";
				definition = "Specifies an alternative identification of a trading party, for example, trader code, trader name, short legal name of firm and so on.";
				trace_lazy = () -> PartyIdentificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyIdentificationType1Code.FXMemberID, com.tools20022.repository.codeset.PartyIdentificationType1Code.FXSystemEnglishShortName,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.InstitutionGroupName, com.tools20022.repository.codeset.PartyIdentificationType1Code.InstitutionIdentificationInComStarSystem,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.InternalGroupTheTraderBelongedTo, com.tools20022.repository.codeset.PartyIdentificationType1Code.MarketMaker,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.MembersOrClients, com.tools20022.repository.codeset.PartyIdentificationType1Code.MemberType,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.NonMarketMaker, com.tools20022.repository.codeset.PartyIdentificationType1Code.OtherSystemCode,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.Password, com.tools20022.repository.codeset.PartyIdentificationType1Code.PhoneNumber,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.PostalAddress, com.tools20022.repository.codeset.PartyIdentificationType1Code.RMBMemberIdentification,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.ShortLegalChineseNameOfFirm, com.tools20022.repository.codeset.PartyIdentificationType1Code.ShortLegalNameOfFirm,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.TraderChineseName, com.tools20022.repository.codeset.PartyIdentificationType1Code.TraderCode,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.TraderName, com.tools20022.repository.codeset.PartyIdentificationType1Code.UserInputTrades,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.UserName, com.tools20022.repository.codeset.PartyIdentificationType1Code.AgentUserInputTrades,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.BranchIdentification, com.tools20022.repository.codeset.PartyIdentificationType1Code.ClearingInstitution,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.CollateralManagementInstitution, com.tools20022.repository.codeset.PartyIdentificationType1Code.CollateralManagementInstitutionName,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.ContactMethodOfTrader, com.tools20022.repository.codeset.PartyIdentificationType1Code.ContactName,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.CustodyManagementInstitution, com.tools20022.repository.codeset.PartyIdentificationType1Code.DealConfirmContactName,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.Department, com.tools20022.repository.codeset.PartyIdentificationType1Code.EligibleCounterparty,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.ExecutionVenue, com.tools20022.repository.codeset.PartyIdentificationType1Code.FirmCode,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.FirmIdentification, com.tools20022.repository.codeset.PartyIdentificationType1Code.FullLegalChineseNameOfFirm,
						com.tools20022.repository.codeset.PartyIdentificationType1Code.FullLegalNameOfFirm);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FXMemberID.getCodeName().get(), FXMemberID);
		codesByName.put(FXSystemEnglishShortName.getCodeName().get(), FXSystemEnglishShortName);
		codesByName.put(InstitutionGroupName.getCodeName().get(), InstitutionGroupName);
		codesByName.put(InstitutionIdentificationInComStarSystem.getCodeName().get(), InstitutionIdentificationInComStarSystem);
		codesByName.put(InternalGroupTheTraderBelongedTo.getCodeName().get(), InternalGroupTheTraderBelongedTo);
		codesByName.put(MarketMaker.getCodeName().get(), MarketMaker);
		codesByName.put(MembersOrClients.getCodeName().get(), MembersOrClients);
		codesByName.put(MemberType.getCodeName().get(), MemberType);
		codesByName.put(NonMarketMaker.getCodeName().get(), NonMarketMaker);
		codesByName.put(OtherSystemCode.getCodeName().get(), OtherSystemCode);
		codesByName.put(Password.getCodeName().get(), Password);
		codesByName.put(PhoneNumber.getCodeName().get(), PhoneNumber);
		codesByName.put(PostalAddress.getCodeName().get(), PostalAddress);
		codesByName.put(RMBMemberIdentification.getCodeName().get(), RMBMemberIdentification);
		codesByName.put(ShortLegalChineseNameOfFirm.getCodeName().get(), ShortLegalChineseNameOfFirm);
		codesByName.put(ShortLegalNameOfFirm.getCodeName().get(), ShortLegalNameOfFirm);
		codesByName.put(TraderChineseName.getCodeName().get(), TraderChineseName);
		codesByName.put(TraderCode.getCodeName().get(), TraderCode);
		codesByName.put(TraderName.getCodeName().get(), TraderName);
		codesByName.put(UserInputTrades.getCodeName().get(), UserInputTrades);
		codesByName.put(UserName.getCodeName().get(), UserName);
		codesByName.put(AgentUserInputTrades.getCodeName().get(), AgentUserInputTrades);
		codesByName.put(BranchIdentification.getCodeName().get(), BranchIdentification);
		codesByName.put(ClearingInstitution.getCodeName().get(), ClearingInstitution);
		codesByName.put(CollateralManagementInstitution.getCodeName().get(), CollateralManagementInstitution);
		codesByName.put(CollateralManagementInstitutionName.getCodeName().get(), CollateralManagementInstitutionName);
		codesByName.put(ContactMethodOfTrader.getCodeName().get(), ContactMethodOfTrader);
		codesByName.put(ContactName.getCodeName().get(), ContactName);
		codesByName.put(CustodyManagementInstitution.getCodeName().get(), CustodyManagementInstitution);
		codesByName.put(DealConfirmContactName.getCodeName().get(), DealConfirmContactName);
		codesByName.put(Department.getCodeName().get(), Department);
		codesByName.put(EligibleCounterparty.getCodeName().get(), EligibleCounterparty);
		codesByName.put(ExecutionVenue.getCodeName().get(), ExecutionVenue);
		codesByName.put(FirmCode.getCodeName().get(), FirmCode);
		codesByName.put(FirmIdentification.getCodeName().get(), FirmIdentification);
		codesByName.put(FullLegalChineseNameOfFirm.getCodeName().get(), FullLegalChineseNameOfFirm);
		codesByName.put(FullLegalNameOfFirm.getCodeName().get(), FullLegalNameOfFirm);
	}

	public static PartyIdentificationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyIdentificationType1Code[] values() {
		PartyIdentificationType1Code[] values = new PartyIdentificationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyIdentificationType1Code> {
		@Override
		public PartyIdentificationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyIdentificationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}