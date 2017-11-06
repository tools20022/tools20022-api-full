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
 * Specifies DTC (The Depository Trust Company) defined issuer status of the
 * event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmApprovedBySEC
 * IssuerStatusCode.mmApprovedBySEC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmApprovedByShareholders
 * IssuerStatusCode.mmApprovedByShareholders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmApprovedByShareholdersAndSEC
 * IssuerStatusCode.mmApprovedByShareholdersAndSEC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmApproximateRate
 * IssuerStatusCode.mmApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmAwaitingInformationFromCompany
 * IssuerStatusCode.mmAwaitingInformationFromCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmDayGracePeriod
 * IssuerStatusCode.mmDayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmDistributionRejected
 * IssuerStatusCode.mmDistributionRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmSeeComments
 * IssuerStatusCode.mmSeeComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmHolidayInCountryofOrigin
 * IssuerStatusCode.mmHolidayInCountryofOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmIssueNotFunded
 * IssuerStatusCode.mmIssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmIssueTradingFlat
 * IssuerStatusCode.mmIssueTradingFlat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmLateAnnouncementWithElections
 * IssuerStatusCode.mmLateAnnouncementWithElections}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmLiquidation
 * IssuerStatusCode.mmLiquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmPaidUponrReceiptOfFunds
 * IssuerStatusCode.mmPaidUponrReceiptOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmPendingConversionOfFunds
 * IssuerStatusCode.mmPendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmPendingEDSElections
 * IssuerStatusCode.mmPendingEDSElections}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmPendingSECApproval
 * IssuerStatusCode.mmPendingSECApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmPendingShareholderAndSECApproval
 * IssuerStatusCode.mmPendingShareholderAndSECApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#mmPendingShareholderApproval
 * IssuerStatusCode.mmPendingShareholderApproval}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
 * IssuerStatus1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ASEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuerStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTC (The Depository Trust Company) defined issuer status of the event."
 * </li>
 * </ul>
 */
public class IssuerStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event is approved by SEC (Securities and Exchange Commission).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedBySEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is approved by SEC (Securities and Exchange Commission)."</li>
	 * </ul>
	 */
	public static final MMCode mmApprovedBySEC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedBySEC";
			definition = "Event is approved by SEC (Securities and Exchange Commission).";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "ASEC";
		}
	};
	/**
	 * Event is approved by shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASHH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByShareholders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is approved by shareholders."</li>
	 * </ul>
	 */
	public static final MMCode mmApprovedByShareholders = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedByShareholders";
			definition = "Event is approved by shareholders.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "ASHH";
		}
	};
	/**
	 * Event is approved by SEC (Securities and Exchange Commission and
	 * shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASHS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByShareholdersAndSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is approved by SEC (Securities and Exchange Commission and shareholders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmApprovedByShareholdersAndSEC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedByShareholdersAndSEC";
			definition = "Event is approved by SEC (Securities and Exchange Commission and shareholders.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "ASHS";
		}
	};
	/**
	 * Event has approximate rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproximateRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event has approximate rate."</li>
	 * </ul>
	 */
	public static final MMCode mmApproximateRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			definition = "Event has approximate rate.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "APRT";
		}
	};
	/**
	 * Awaiting information from company on the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AIFC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingInformationFromCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Awaiting information from company on the event."</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingInformationFromCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingInformationFromCompany";
			definition = "Awaiting information from company on the event.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "AIFC";
		}
	};
	/**
	 * Event has day grace period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayGracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event has day grace period."</li>
	 * </ul>
	 */
	public static final MMCode mmDayGracePeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayGracePeriod";
			definition = "Event has day grace period.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "DGRP";
		}
	};
	/**
	 * Event distribution was rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DREJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event distribution was rejected."</li>
	 * </ul>
	 */
	public static final MMCode mmDistributionRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionRejected";
			definition = "Event distribution was rejected.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "DREJ";
		}
	};
	/**
	 * Event has free form comments for review.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FFCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeeComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event has free form comments for review."</li>
	 * </ul>
	 */
	public static final MMCode mmSeeComments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeeComments";
			definition = "Event has free form comments for review.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "FFCO";
		}
	};
	/**
	 * Holiday in country of origin of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolidayInCountryofOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holiday in country of origin of the event."</li>
	 * </ul>
	 */
	public static final MMCode mmHolidayInCountryofOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryofOrigin";
			definition = "Holiday in country of origin of the event.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "HOCO";
		}
	};
	/**
	 * Event issue is not funded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event issue is not funded."</li>
	 * </ul>
	 */
	public static final MMCode mmIssueNotFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			definition = "Event issue is not funded.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "INFN";
		}
	};
	/**
	 * Event issue is trading flat.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueTradingFlat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event issue is trading flat."</li>
	 * </ul>
	 */
	public static final MMCode mmIssueTradingFlat = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueTradingFlat";
			definition = "Event issue is trading flat.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "ITFL";
		}
	};
	/**
	 * Event is a late announcement with elections.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAWE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncementWithElections"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is a late announcement with elections."</li>
	 * </ul>
	 */
	public static final MMCode mmLateAnnouncementWithElections = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncementWithElections";
			definition = "Event is a late announcement with elections.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "LAWE";
		}
	};
	/**
	 * Event is a liquidation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is a liquidation."</li>
	 * </ul>
	 */
	public static final MMCode mmLiquidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			definition = "Event is a liquidation.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * Event proceeds will be paid upon receipt of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PURF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaidUponrReceiptOfFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event proceeds will be paid upon receipt of funds."</li>
	 * </ul>
	 */
	public static final MMCode mmPaidUponrReceiptOfFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponrReceiptOfFunds";
			definition = "Event proceeds will be paid upon receipt of funds.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "PURF";
		}
	};
	/**
	 * Event processed are pending conversion of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConversionOfFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event processed are pending conversion of funds."</li>
	 * </ul>
	 */
	public static final MMCode mmPendingConversionOfFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			definition = "Event processed are pending conversion of funds.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "PCOF";
		}
	};
	/**
	 * Event is pending election dividend services elections.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PELE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingEDSElections"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is pending election dividend services elections."</li>
	 * </ul>
	 */
	public static final MMCode mmPendingEDSElections = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingEDSElections";
			definition = "Event is pending election dividend services elections.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "PELE";
		}
	};
	/**
	 * Event is pending SEC (Securities and Exchange Commission approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSECApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is pending SEC (Securities and Exchange Commission approval."</li>
	 * </ul>
	 */
	public static final MMCode mmPendingSECApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSECApproval";
			definition = "Event is pending SEC (Securities and Exchange Commission approval.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "PSEC";
		}
	};
	/**
	 * Event is pending SEC (Securities and Exchange Commission and shareholders
	 * approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSHS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingShareholderAndSECApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is pending SEC (Securities and Exchange Commission and shareholders approval."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingShareholderAndSECApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingShareholderAndSECApproval";
			definition = "Event is pending SEC (Securities and Exchange Commission and shareholders approval.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "PSHS";
		}
	};
	/**
	 * Event is pending shareholder approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
	 * IssuerStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSHA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingShareholderApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event is pending shareholder approval."</li>
	 * </ul>
	 */
	public static final MMCode mmPendingShareholderApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingShareholderApproval";
			definition = "Event is pending shareholder approval.";
			owner_lazy = () -> IssuerStatusCode.mmObject();
			codeName = "PSHA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ASEC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IssuerStatusCode";
				definition = "Specifies DTC (The Depository Trust Company) defined issuer status of the event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuerStatusCode.mmApprovedBySEC, com.tools20022.repository.codeset.IssuerStatusCode.mmApprovedByShareholders,
						com.tools20022.repository.codeset.IssuerStatusCode.mmApprovedByShareholdersAndSEC, com.tools20022.repository.codeset.IssuerStatusCode.mmApproximateRate,
						com.tools20022.repository.codeset.IssuerStatusCode.mmAwaitingInformationFromCompany, com.tools20022.repository.codeset.IssuerStatusCode.mmDayGracePeriod,
						com.tools20022.repository.codeset.IssuerStatusCode.mmDistributionRejected, com.tools20022.repository.codeset.IssuerStatusCode.mmSeeComments,
						com.tools20022.repository.codeset.IssuerStatusCode.mmHolidayInCountryofOrigin, com.tools20022.repository.codeset.IssuerStatusCode.mmIssueNotFunded,
						com.tools20022.repository.codeset.IssuerStatusCode.mmIssueTradingFlat, com.tools20022.repository.codeset.IssuerStatusCode.mmLateAnnouncementWithElections,
						com.tools20022.repository.codeset.IssuerStatusCode.mmLiquidation, com.tools20022.repository.codeset.IssuerStatusCode.mmPaidUponrReceiptOfFunds,
						com.tools20022.repository.codeset.IssuerStatusCode.mmPendingConversionOfFunds, com.tools20022.repository.codeset.IssuerStatusCode.mmPendingEDSElections,
						com.tools20022.repository.codeset.IssuerStatusCode.mmPendingSECApproval, com.tools20022.repository.codeset.IssuerStatusCode.mmPendingShareholderAndSECApproval,
						com.tools20022.repository.codeset.IssuerStatusCode.mmPendingShareholderApproval);
				derivation_lazy = () -> Arrays.asList(IssuerStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}