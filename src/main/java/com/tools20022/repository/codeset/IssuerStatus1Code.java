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
import com.tools20022.repository.codeset.IssuerStatusCode;
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
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#ApprovedBySEC
 * IssuerStatus1Code.ApprovedBySEC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#ApprovedByShareholders
 * IssuerStatus1Code.ApprovedByShareholders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#ApprovedByShareholdersAndSEC
 * IssuerStatus1Code.ApprovedByShareholdersAndSEC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#ApproximateRate
 * IssuerStatus1Code.ApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#AwaitingInformationFromCompany
 * IssuerStatus1Code.AwaitingInformationFromCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#DayGracePeriod
 * IssuerStatus1Code.DayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#DistributionRejected
 * IssuerStatus1Code.DistributionRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#SeeComments
 * IssuerStatus1Code.SeeComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#HolidayInCountryofOrigin
 * IssuerStatus1Code.HolidayInCountryofOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#IssueNotFunded
 * IssuerStatus1Code.IssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#IssueTradingFlat
 * IssuerStatus1Code.IssueTradingFlat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#LateAnnouncementWithElections
 * IssuerStatus1Code.LateAnnouncementWithElections}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#Liquidation
 * IssuerStatus1Code.Liquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#PaidUponrReceiptOfFunds
 * IssuerStatus1Code.PaidUponrReceiptOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#PendingConversionOfFunds
 * IssuerStatus1Code.PendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#PendingEDSElections
 * IssuerStatus1Code.PendingEDSElections}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#PendingSECApproval
 * IssuerStatus1Code.PendingSECApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#PendingShareholderAndSECApproval
 * IssuerStatus1Code.PendingShareholderAndSECApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code#PendingShareholderApproval
 * IssuerStatus1Code.PendingShareholderApproval}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	public static final MMCode ApprovedBySEC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ApprovedByShareholders = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ApprovedByShareholdersAndSEC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ApproximateRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode AwaitingInformationFromCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode DayGracePeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode DistributionRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode SeeComments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode HolidayInCountryofOrigin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode IssueNotFunded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode IssueTradingFlat = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode LateAnnouncementWithElections = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Liquidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PaidUponrReceiptOfFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PendingConversionOfFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PendingEDSElections = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PendingSECApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PendingShareholderAndSECApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PendingShareholderApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingShareholderApproval";
			owner_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ASEC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IssuerStatus1Code";
				definition = "Specifies DTC (The Depository Trust Company) defined issuer status of the event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuerStatus1Code.ApprovedBySEC, com.tools20022.repository.codeset.IssuerStatus1Code.ApprovedByShareholders,
						com.tools20022.repository.codeset.IssuerStatus1Code.ApprovedByShareholdersAndSEC, com.tools20022.repository.codeset.IssuerStatus1Code.ApproximateRate,
						com.tools20022.repository.codeset.IssuerStatus1Code.AwaitingInformationFromCompany, com.tools20022.repository.codeset.IssuerStatus1Code.DayGracePeriod,
						com.tools20022.repository.codeset.IssuerStatus1Code.DistributionRejected, com.tools20022.repository.codeset.IssuerStatus1Code.SeeComments,
						com.tools20022.repository.codeset.IssuerStatus1Code.HolidayInCountryofOrigin, com.tools20022.repository.codeset.IssuerStatus1Code.IssueNotFunded, com.tools20022.repository.codeset.IssuerStatus1Code.IssueTradingFlat,
						com.tools20022.repository.codeset.IssuerStatus1Code.LateAnnouncementWithElections, com.tools20022.repository.codeset.IssuerStatus1Code.Liquidation,
						com.tools20022.repository.codeset.IssuerStatus1Code.PaidUponrReceiptOfFunds, com.tools20022.repository.codeset.IssuerStatus1Code.PendingConversionOfFunds,
						com.tools20022.repository.codeset.IssuerStatus1Code.PendingEDSElections, com.tools20022.repository.codeset.IssuerStatus1Code.PendingSECApproval,
						com.tools20022.repository.codeset.IssuerStatus1Code.PendingShareholderAndSECApproval, com.tools20022.repository.codeset.IssuerStatus1Code.PendingShareholderApproval);
				trace_lazy = () -> IssuerStatusCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}