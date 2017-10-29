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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies an alternative identification of a trading party, for example,
 * trader code, trader name, short legal name of firm and so on.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#TraderCode
 * PartyIdentificationTypeCode.TraderCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#FullLegalNameOfFirm
 * PartyIdentificationTypeCode.FullLegalNameOfFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#PostalAddress
 * PartyIdentificationTypeCode.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#PhoneNumber
 * PartyIdentificationTypeCode.PhoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#ContactName
 * PartyIdentificationTypeCode.ContactName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#Department
 * PartyIdentificationTypeCode.Department}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#MarketMaker
 * PartyIdentificationTypeCode.MarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#TraderName
 * PartyIdentificationTypeCode.TraderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#ShortLegalNameOfFirm
 * PartyIdentificationTypeCode.ShortLegalNameOfFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#ContactMethodOfTrader
 * PartyIdentificationTypeCode.ContactMethodOfTrader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#MembersOrClients
 * PartyIdentificationTypeCode.MembersOrClients}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#NonMarketMaker
 * PartyIdentificationTypeCode.NonMarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#FullLegalChineseNameOfFirm
 * PartyIdentificationTypeCode.FullLegalChineseNameOfFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#ShortLegalChineseNameOfFirm
 * PartyIdentificationTypeCode.ShortLegalChineseNameOfFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#TraderChineseName
 * PartyIdentificationTypeCode.TraderChineseName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#ZipCode
 * PartyIdentificationTypeCode.ZipCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#FirmCode
 * PartyIdentificationTypeCode.FirmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#CollateralManagementInstitution
 * PartyIdentificationTypeCode.CollateralManagementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#CollateralManagementInstitutionName
 * PartyIdentificationTypeCode.CollateralManagementInstitutionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#InstitutionGroupName
 * PartyIdentificationTypeCode.InstitutionGroupName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#FirmIdentification
 * PartyIdentificationTypeCode.FirmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#ClearingInstitution
 * PartyIdentificationTypeCode.ClearingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#InternalGroupTheTraderBelongedTo
 * PartyIdentificationTypeCode.InternalGroupTheTraderBelongedTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#DealConfirmContactName
 * PartyIdentificationTypeCode.DealConfirmContactName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#RMBMemberIdentification
 * PartyIdentificationTypeCode.RMBMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#FXMemberID
 * PartyIdentificationTypeCode.FXMemberID}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#FXSystemEnglishShortName
 * PartyIdentificationTypeCode.FXSystemEnglishShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#OtherSystemCode
 * PartyIdentificationTypeCode.OtherSystemCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#CustodyManagementInstitution
 * PartyIdentificationTypeCode.CustodyManagementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#InstitutionIdentificationInComStarSystem
 * PartyIdentificationTypeCode.InstitutionIdentificationInComStarSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#UserName
 * PartyIdentificationTypeCode.UserName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#Password
 * PartyIdentificationTypeCode.Password}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#MemberType
 * PartyIdentificationTypeCode.MemberType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#UserInputTrades
 * PartyIdentificationTypeCode.UserInputTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#AgentUserInputTrades
 * PartyIdentificationTypeCode.AgentUserInputTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#ExecutionVenue
 * PartyIdentificationTypeCode.ExecutionVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#EligibleCounterparty
 * PartyIdentificationTypeCode.EligibleCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode#BranchIdentification
 * PartyIdentificationTypeCode.BranchIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationType1Code
 * PartyIdentificationType1Code}</li>
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
 * "PartyIdentificationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an alternative identification of a trading party, for example, trader code, trader name, short legal name of firm and so on."
 * </li>
 * </ul>
 */
public class PartyIdentificationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the traders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraderCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the traders."</li>
	 * </ul>
	 */
	public static final MMCode TraderCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraderCode";
			definition = "Specifies the traders.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "TRCO";
		}
	};
	/**
	 * Legal full title of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullLegalNameOfFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal full title of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode FullLegalNameOfFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullLegalNameOfFirm";
			definition = "Legal full title of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "FLNF";
		}
	};
	/**
	 * Postal address of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode PostalAddress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Postal address of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "POAD";
		}
	};
	/**
	 * Phone number of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PONU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Phone number of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode PhoneNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNumber";
			definition = "Phone number of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "PONU";
		}
	};
	/**
	 * Contact name of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact name of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode ContactName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactName";
			definition = "Contact name of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "CONU";
		}
	};
	/**
	 * Department of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Department"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Department of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode Department = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Department";
			definition = "Department of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "DEPA";
		}
	};
	/**
	 * Specifies the maket makers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the maket makers."</li>
	 * </ul>
	 */
	public static final MMCode MarketMaker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMaker";
			definition = "Specifies the maket makers.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "MAMA";
		}
	};
	/**
	 * Names for the traders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TANA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraderName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Names for the traders."</li>
	 * </ul>
	 */
	public static final MMCode TraderName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraderName";
			definition = "Names for the traders.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "TANA";
		}
	};
	/**
	 * Legal short title of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLegalNameOfFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal short title of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode ShortLegalNameOfFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLegalNameOfFirm";
			definition = "Legal short title of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "SLNF";
		}
	};
	/**
	 * Contact method of the traders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactMethodOfTrader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact method of the traders."</li>
	 * </ul>
	 */
	public static final MMCode ContactMethodOfTrader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactMethodOfTrader";
			definition = "Contact method of the traders.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "CMOT";
		}
	};
	/**
	 * Identify members or clients.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MembersOrClients"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identify members or clients."</li>
	 * </ul>
	 */
	public static final MMCode MembersOrClients = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MembersOrClients";
			definition = "Identify members or clients.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "MEOC";
		}
	};
	/**
	 * Specifies the non maket makers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonMarketMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the non maket makers."</li>
	 * </ul>
	 */
	public static final MMCode NonMarketMaker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonMarketMaker";
			definition = "Specifies the non maket makers.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "NOMM";
		}
	};
	/**
	 * Legal chinese full title of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullLegalChineseNameOfFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal chinese full title of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode FullLegalChineseNameOfFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullLegalChineseNameOfFirm";
			definition = "Legal chinese full title of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "FLCN";
		}
	};
	/**
	 * Legal chinese short title of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLegalChineseNameOfFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal chinese short title of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode ShortLegalChineseNameOfFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLegalChineseNameOfFirm";
			definition = "Legal chinese short title of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "SLCN";
		}
	};
	/**
	 * Chinese names for the traders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TACN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraderChineseName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Chinese names for the traders."</li>
	 * </ul>
	 */
	public static final MMCode TraderChineseName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraderChineseName";
			definition = "Chinese names for the traders.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "TACN";
		}
	};
	/**
	 * Zip code of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZICO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZipCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Zip code of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode ZipCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZipCode";
			definition = "Zip code of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "ZICO";
		}
	};
	/**
	 * Specifies the firm.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FICO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the firm."</li>
	 * </ul>
	 */
	public static final MMCode FirmCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmCode";
			definition = "Specifies the firm.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "FICO";
		}
	};
	/**
	 * Identification of the collateral management institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagementInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the collateral management institution."</li>
	 * </ul>
	 */
	public static final MMCode CollateralManagementInstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagementInstitution";
			definition = "Identification of the collateral management institution.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "CMID";
		}
	};
	/**
	 * Name of the collateral management institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagementInstitutionName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the collateral management institution."</li>
	 * </ul>
	 */
	public static final MMCode CollateralManagementInstitutionName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagementInstitutionName";
			definition = "Name of the collateral management institution.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "COIN";
		}
	};
	/**
	 * Name of the firm group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionGroupName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the firm group."</li>
	 * </ul>
	 */
	public static final MMCode InstitutionGroupName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionGroupName";
			definition = "Name of the firm group.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "INGN";
		}
	};
	/**
	 * Identification of the firm.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the firm."</li>
	 * </ul>
	 */
	public static final MMCode FirmIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmIdentification";
			definition = "Identification of the firm.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "FIID";
		}
	};
	/**
	 * Specifies clearing institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies clearing institution."</li>
	 * </ul>
	 */
	public static final MMCode ClearingInstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingInstitution";
			definition = "Specifies clearing institution.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "CLIN";
		}
	};
	/**
	 * Internal team that traders belong.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IGBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalGroupTheTraderBelongedTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Internal team that traders belong.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode InternalGroupTheTraderBelongedTo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalGroupTheTraderBelongedTo";
			definition = "Internal team that traders belong.\r\n";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "IGBT";
		}
	};
	/**
	 * Trade confimation person name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealConfirmContactName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade confimation person name."</li>
	 * </ul>
	 */
	public static final MMCode DealConfirmContactName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealConfirmContactName";
			definition = "Trade confimation person name.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "DECN";
		}
	};
	/**
	 * Member identification of the RMB trading system<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RMBMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Member identification of the RMB trading system\r\n"</li>
	 * </ul>
	 */
	public static final MMCode RMBMemberIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RMBMemberIdentification";
			definition = "Member identification of the RMB trading system\r\n";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "RMID";
		}
	};
	/**
	 * Member identification of the FX trading system
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXMemberID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Member identification of the FX trading system"</li>
	 * </ul>
	 */
	public static final MMCode FXMemberID = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXMemberID";
			definition = "Member identification of the FX trading system";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "FXID";
		}
	};
	/**
	 * English short name of FX system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXSN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXSystemEnglishShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "English short name of FX system."</li>
	 * </ul>
	 */
	public static final MMCode FXSystemEnglishShortName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXSystemEnglishShortName";
			definition = "English short name of FX system.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "FXSN";
		}
	};
	/**
	 * Specifies other system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OSCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherSystemCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies other system."</li>
	 * </ul>
	 */
	public static final MMCode OtherSystemCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherSystemCode";
			definition = "Specifies other system.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "OSCO";
		}
	};
	/**
	 * Institution of custody management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyManagementInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Institution of custody management."</li>
	 * </ul>
	 */
	public static final MMCode CustodyManagementInstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyManagementInstitution";
			definition = "Institution of custody management.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "CMIN";
		}
	};
	/**
	 * Institution identification in com star system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IICS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionIdentificationInComStarSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Institution identification in com star system."</li>
	 * </ul>
	 */
	public static final MMCode InstitutionIdentificationInComStarSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionIdentificationInComStarSystem";
			definition = "Institution identification in com star system.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "IICS";
		}
	};
	/**
	 * User name of the trading system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USNA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "User name of the trading system."</li>
	 * </ul>
	 */
	public static final MMCode UserName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserName";
			definition = "User name of the trading system.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "USNA";
		}
	};
	/**
	 * Password of the trading system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PASS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Password of the trading system."</li>
	 * </ul>
	 */
	public static final MMCode Password = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			definition = "Password of the trading system.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Type of the trading members.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "METY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the trading members."</li>
	 * </ul>
	 */
	public static final MMCode MemberType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberType";
			definition = "Type of the trading members.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "METY";
		}
	};
	/**
	 * Input the user of trading system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserInputTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Input the user of trading system."</li>
	 * </ul>
	 */
	public static final MMCode UserInputTrades = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserInputTrades";
			definition = "Input the user of trading system.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "USIT";
		}
	};
	/**
	 * Agent input the user of the trading system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentUserInputTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent input the user of the trading system."</li>
	 * </ul>
	 */
	public static final MMCode AgentUserInputTrades = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentUserInputTrades";
			definition = "Agent input the user of the trading system.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "AUIT";
		}
	};
	/**
	 * Place of execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of execution."</li>
	 * </ul>
	 */
	public static final MMCode ExecutionVenue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionVenue";
			definition = "Place of execution.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "EXVE";
		}
	};
	/**
	 * Specifies eligible of counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies eligible of counterparty."</li>
	 * </ul>
	 */
	public static final MMCode EligibleCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleCounterparty";
			definition = "Specifies eligible of counterparty.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "ELCO";
		}
	};
	/**
	 * Identification of the branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIdentificationTypeCode
	 * PartyIdentificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BranchIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the branch."</li>
	 * </ul>
	 */
	public static final MMCode BranchIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			definition = "Identification of the branch.";
			owner_lazy = () -> PartyIdentificationTypeCode.mmObject();
			codeName = "BRID";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationTypeCode";
				definition = "Specifies an alternative identification of a trading party, for example, trader code, trader name, short legal name of firm and so on.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyIdentificationTypeCode.TraderCode, com.tools20022.repository.codeset.PartyIdentificationTypeCode.FullLegalNameOfFirm,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.PostalAddress, com.tools20022.repository.codeset.PartyIdentificationTypeCode.PhoneNumber,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.ContactName, com.tools20022.repository.codeset.PartyIdentificationTypeCode.Department,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.MarketMaker, com.tools20022.repository.codeset.PartyIdentificationTypeCode.TraderName,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.ShortLegalNameOfFirm, com.tools20022.repository.codeset.PartyIdentificationTypeCode.ContactMethodOfTrader,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.MembersOrClients, com.tools20022.repository.codeset.PartyIdentificationTypeCode.NonMarketMaker,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.FullLegalChineseNameOfFirm, com.tools20022.repository.codeset.PartyIdentificationTypeCode.ShortLegalChineseNameOfFirm,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.TraderChineseName, com.tools20022.repository.codeset.PartyIdentificationTypeCode.ZipCode,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.FirmCode, com.tools20022.repository.codeset.PartyIdentificationTypeCode.CollateralManagementInstitution,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.CollateralManagementInstitutionName, com.tools20022.repository.codeset.PartyIdentificationTypeCode.InstitutionGroupName,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.FirmIdentification, com.tools20022.repository.codeset.PartyIdentificationTypeCode.ClearingInstitution,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.InternalGroupTheTraderBelongedTo, com.tools20022.repository.codeset.PartyIdentificationTypeCode.DealConfirmContactName,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.RMBMemberIdentification, com.tools20022.repository.codeset.PartyIdentificationTypeCode.FXMemberID,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.FXSystemEnglishShortName, com.tools20022.repository.codeset.PartyIdentificationTypeCode.OtherSystemCode,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.CustodyManagementInstitution, com.tools20022.repository.codeset.PartyIdentificationTypeCode.InstitutionIdentificationInComStarSystem,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.UserName, com.tools20022.repository.codeset.PartyIdentificationTypeCode.Password,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.MemberType, com.tools20022.repository.codeset.PartyIdentificationTypeCode.UserInputTrades,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.AgentUserInputTrades, com.tools20022.repository.codeset.PartyIdentificationTypeCode.ExecutionVenue,
						com.tools20022.repository.codeset.PartyIdentificationTypeCode.EligibleCounterparty, com.tools20022.repository.codeset.PartyIdentificationTypeCode.BranchIdentification);
				derivation_lazy = () -> Arrays.asList(PartyIdentificationType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}