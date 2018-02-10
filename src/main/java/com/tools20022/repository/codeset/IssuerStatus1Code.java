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
import com.tools20022.repository.codeset.IssuerStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTC (The Depository Trust Company) defined issuer status of the
 * event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode
 * IssuerStatusCode}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IssuerStatus1Code extends MMCode {

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
	public static final IssuerStatus1Code ApprovedBySEC = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedBySEC";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.ApprovedBySEC.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code ApprovedByShareholders = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedByShareholders";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.ApprovedByShareholders.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code ApprovedByShareholdersAndSEC = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedByShareholdersAndSEC";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.ApprovedByShareholdersAndSEC.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code ApproximateRate = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.ApproximateRate.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code AwaitingInformationFromCompany = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingInformationFromCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.AwaitingInformationFromCompany.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code DayGracePeriod = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayGracePeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.DayGracePeriod.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code DistributionRejected = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.DistributionRejected.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code SeeComments = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeeComments";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.SeeComments.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code HolidayInCountryofOrigin = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryofOrigin";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.HolidayInCountryofOrigin.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code IssueNotFunded = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.IssueNotFunded.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code IssueTradingFlat = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueTradingFlat";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.IssueTradingFlat.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code LateAnnouncementWithElections = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncementWithElections";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.LateAnnouncementWithElections.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code Liquidation = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.Liquidation.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code PaidUponrReceiptOfFunds = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponrReceiptOfFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.PaidUponrReceiptOfFunds.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code PendingConversionOfFunds = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.PendingConversionOfFunds.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code PendingEDSElections = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingEDSElections";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.PendingEDSElections.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code PendingSECApproval = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSECApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.PendingSECApproval.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code PendingShareholderAndSECApproval = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingShareholderAndSECApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.PendingShareholderAndSECApproval.getCodeName().orElse(name);
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
	public static final IssuerStatus1Code PendingShareholderApproval = new IssuerStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingShareholderApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatus1Code.mmObject();
			codeName = IssuerStatusCode.PendingShareholderApproval.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, IssuerStatus1Code> codesByName = new LinkedHashMap<>();

	protected IssuerStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ASEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuerStatus1Code";
				definition = "Specifies DTC (The Depository Trust Company) defined issuer status of the event.";
				trace_lazy = () -> IssuerStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuerStatus1Code.ApprovedBySEC, com.tools20022.repository.codeset.IssuerStatus1Code.ApprovedByShareholders,
						com.tools20022.repository.codeset.IssuerStatus1Code.ApprovedByShareholdersAndSEC, com.tools20022.repository.codeset.IssuerStatus1Code.ApproximateRate,
						com.tools20022.repository.codeset.IssuerStatus1Code.AwaitingInformationFromCompany, com.tools20022.repository.codeset.IssuerStatus1Code.DayGracePeriod,
						com.tools20022.repository.codeset.IssuerStatus1Code.DistributionRejected, com.tools20022.repository.codeset.IssuerStatus1Code.SeeComments,
						com.tools20022.repository.codeset.IssuerStatus1Code.HolidayInCountryofOrigin, com.tools20022.repository.codeset.IssuerStatus1Code.IssueNotFunded, com.tools20022.repository.codeset.IssuerStatus1Code.IssueTradingFlat,
						com.tools20022.repository.codeset.IssuerStatus1Code.LateAnnouncementWithElections, com.tools20022.repository.codeset.IssuerStatus1Code.Liquidation,
						com.tools20022.repository.codeset.IssuerStatus1Code.PaidUponrReceiptOfFunds, com.tools20022.repository.codeset.IssuerStatus1Code.PendingConversionOfFunds,
						com.tools20022.repository.codeset.IssuerStatus1Code.PendingEDSElections, com.tools20022.repository.codeset.IssuerStatus1Code.PendingSECApproval,
						com.tools20022.repository.codeset.IssuerStatus1Code.PendingShareholderAndSECApproval, com.tools20022.repository.codeset.IssuerStatus1Code.PendingShareholderApproval);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ApprovedBySEC.getCodeName().get(), ApprovedBySEC);
		codesByName.put(ApprovedByShareholders.getCodeName().get(), ApprovedByShareholders);
		codesByName.put(ApprovedByShareholdersAndSEC.getCodeName().get(), ApprovedByShareholdersAndSEC);
		codesByName.put(ApproximateRate.getCodeName().get(), ApproximateRate);
		codesByName.put(AwaitingInformationFromCompany.getCodeName().get(), AwaitingInformationFromCompany);
		codesByName.put(DayGracePeriod.getCodeName().get(), DayGracePeriod);
		codesByName.put(DistributionRejected.getCodeName().get(), DistributionRejected);
		codesByName.put(SeeComments.getCodeName().get(), SeeComments);
		codesByName.put(HolidayInCountryofOrigin.getCodeName().get(), HolidayInCountryofOrigin);
		codesByName.put(IssueNotFunded.getCodeName().get(), IssueNotFunded);
		codesByName.put(IssueTradingFlat.getCodeName().get(), IssueTradingFlat);
		codesByName.put(LateAnnouncementWithElections.getCodeName().get(), LateAnnouncementWithElections);
		codesByName.put(Liquidation.getCodeName().get(), Liquidation);
		codesByName.put(PaidUponrReceiptOfFunds.getCodeName().get(), PaidUponrReceiptOfFunds);
		codesByName.put(PendingConversionOfFunds.getCodeName().get(), PendingConversionOfFunds);
		codesByName.put(PendingEDSElections.getCodeName().get(), PendingEDSElections);
		codesByName.put(PendingSECApproval.getCodeName().get(), PendingSECApproval);
		codesByName.put(PendingShareholderAndSECApproval.getCodeName().get(), PendingShareholderAndSECApproval);
		codesByName.put(PendingShareholderApproval.getCodeName().get(), PendingShareholderApproval);
	}

	public static IssuerStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IssuerStatus1Code[] values() {
		IssuerStatus1Code[] values = new IssuerStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IssuerStatus1Code> {
		@Override
		public IssuerStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IssuerStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}