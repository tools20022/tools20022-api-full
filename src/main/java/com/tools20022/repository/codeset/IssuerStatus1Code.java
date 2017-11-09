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
import com.tools20022.repository.codeset.IssuerStatusCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies DTC (The Depository Trust Company) defined issuer status of the
 * event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
 * IssuerStatusCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmApprovedBySEC
 * IssuerStatus1Code.mmApprovedBySEC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmApprovedByShareholders
 * IssuerStatus1Code.mmApprovedByShareholders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmApprovedByShareholdersAndSEC
 * IssuerStatus1Code.mmApprovedByShareholdersAndSEC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmApproximateRate
 * IssuerStatus1Code.mmApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmAwaitingInformationFromCompany
 * IssuerStatus1Code.mmAwaitingInformationFromCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmDayGracePeriod
 * IssuerStatus1Code.mmDayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmDistributionRejected
 * IssuerStatus1Code.mmDistributionRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmSeeComments
 * IssuerStatus1Code.mmSeeComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmHolidayInCountryofOrigin
 * IssuerStatus1Code.mmHolidayInCountryofOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmIssueNotFunded
 * IssuerStatus1Code.mmIssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmIssueTradingFlat
 * IssuerStatus1Code.mmIssueTradingFlat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmLateAnnouncementWithElections
 * IssuerStatus1Code.mmLateAnnouncementWithElections}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmLiquidation
 * IssuerStatus1Code.mmLiquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmPaidUponrReceiptOfFunds
 * IssuerStatus1Code.mmPaidUponrReceiptOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmPendingConversionOfFunds
 * IssuerStatus1Code.mmPendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmPendingEDSElections
 * IssuerStatus1Code.mmPendingEDSElections}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmPendingSECApproval
 * IssuerStatus1Code.mmPendingSECApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmPendingShareholderAndSECApproval
 * IssuerStatus1Code.mmPendingShareholderAndSECApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#mmPendingShareholderApproval
 * IssuerStatus1Code.mmPendingShareholderApproval}</li>
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
 * "IssuerStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTC (The Depository Trust Company) defined issuer status of the event."
 * </li>
 * </ul>
 */
public class IssuerStatus1Code extends IssuerStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedBySEC"</li>
	 * </ul>
	 */
	public static final MMCode mmApprovedBySEC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedBySEC";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByShareholders"</li>
	 * </ul>
	 */
	public static final MMCode mmApprovedByShareholders = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedByShareholders";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedByShareholdersAndSEC"</li>
	 * </ul>
	 */
	public static final MMCode mmApprovedByShareholdersAndSEC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedByShareholdersAndSEC";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApproximateRate"</li>
	 * </ul>
	 */
	public static final MMCode mmApproximateRate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingInformationFromCompany"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingInformationFromCompany = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingInformationFromCompany";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayGracePeriod"</li>
	 * </ul>
	 */
	public static final MMCode mmDayGracePeriod = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayGracePeriod";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionRejected"</li>
	 * </ul>
	 */
	public static final MMCode mmDistributionRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionRejected";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeeComments"</li>
	 * </ul>
	 */
	public static final MMCode mmSeeComments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeeComments";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolidayInCountryofOrigin"</li>
	 * </ul>
	 */
	public static final MMCode mmHolidayInCountryofOrigin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryofOrigin";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNotFunded"</li>
	 * </ul>
	 */
	public static final MMCode mmIssueNotFunded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueTradingFlat"</li>
	 * </ul>
	 */
	public static final MMCode mmIssueTradingFlat = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueTradingFlat";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncementWithElections"</li>
	 * </ul>
	 */
	public static final MMCode mmLateAnnouncementWithElections = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncementWithElections";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * </ul>
	 */
	public static final MMCode mmLiquidation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaidUponrReceiptOfFunds"</li>
	 * </ul>
	 */
	public static final MMCode mmPaidUponrReceiptOfFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponrReceiptOfFunds";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConversionOfFunds"</li>
	 * </ul>
	 */
	public static final MMCode mmPendingConversionOfFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingEDSElections"</li>
	 * </ul>
	 */
	public static final MMCode mmPendingEDSElections = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingEDSElections";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSECApproval"</li>
	 * </ul>
	 */
	public static final MMCode mmPendingSECApproval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSECApproval";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingShareholderAndSECApproval"</li>
	 * </ul>
	 */
	public static final MMCode mmPendingShareholderAndSECApproval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingShareholderAndSECApproval";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingShareholderApproval"</li>
	 * </ul>
	 */
	public static final MMCode mmPendingShareholderApproval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingShareholderApproval";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ASEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuerStatus1Code";
				definition = "Specifies DTC (The Depository Trust Company) defined issuer status of the event.";
				code_lazy = () -> Arrays.asList(IssuerStatus1Code.mmApprovedBySEC, IssuerStatus1Code.mmApprovedByShareholders, IssuerStatus1Code.mmApprovedByShareholdersAndSEC, IssuerStatus1Code.mmApproximateRate,
						IssuerStatus1Code.mmAwaitingInformationFromCompany, IssuerStatus1Code.mmDayGracePeriod, IssuerStatus1Code.mmDistributionRejected, IssuerStatus1Code.mmSeeComments, IssuerStatus1Code.mmHolidayInCountryofOrigin,
						IssuerStatus1Code.mmIssueNotFunded, IssuerStatus1Code.mmIssueTradingFlat, IssuerStatus1Code.mmLateAnnouncementWithElections, IssuerStatus1Code.mmLiquidation, IssuerStatus1Code.mmPaidUponrReceiptOfFunds,
						IssuerStatus1Code.mmPendingConversionOfFunds, IssuerStatus1Code.mmPendingEDSElections, IssuerStatus1Code.mmPendingSECApproval, IssuerStatus1Code.mmPendingShareholderAndSECApproval,
						IssuerStatus1Code.mmPendingShareholderApproval);
				trace_lazy = () -> IssuerStatusCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}