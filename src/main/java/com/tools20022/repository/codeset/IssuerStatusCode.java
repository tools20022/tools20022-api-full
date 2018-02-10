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
import com.tools20022.repository.codeset.IssuerStatusCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#ApprovedBySEC
 * IssuerStatusCode.ApprovedBySEC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#ApprovedByShareholders
 * IssuerStatusCode.ApprovedByShareholders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#ApprovedByShareholdersAndSEC
 * IssuerStatusCode.ApprovedByShareholdersAndSEC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#ApproximateRate
 * IssuerStatusCode.ApproximateRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#AwaitingInformationFromCompany
 * IssuerStatusCode.AwaitingInformationFromCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#DayGracePeriod
 * IssuerStatusCode.DayGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#DistributionRejected
 * IssuerStatusCode.DistributionRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#SeeComments
 * IssuerStatusCode.SeeComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#HolidayInCountryofOrigin
 * IssuerStatusCode.HolidayInCountryofOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#IssueNotFunded
 * IssuerStatusCode.IssueNotFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#IssueTradingFlat
 * IssuerStatusCode.IssueTradingFlat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#LateAnnouncementWithElections
 * IssuerStatusCode.LateAnnouncementWithElections}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#Liquidation
 * IssuerStatusCode.Liquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#PaidUponrReceiptOfFunds
 * IssuerStatusCode.PaidUponrReceiptOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#PendingConversionOfFunds
 * IssuerStatusCode.PendingConversionOfFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#PendingEDSElections
 * IssuerStatusCode.PendingEDSElections}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#PendingSECApproval
 * IssuerStatusCode.PendingSECApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#PendingShareholderAndSECApproval
 * IssuerStatusCode.PendingShareholderAndSECApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerStatusCode#PendingShareholderApproval
 * IssuerStatusCode.PendingShareholderApproval}</li>
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
 * "IssuerStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTC (The Depository Trust Company) defined issuer status of the event."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IssuerStatusCode extends MMCode {

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
	public static final IssuerStatusCode ApprovedBySEC = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedBySEC";
			definition = "Event is approved by SEC (Securities and Exchange Commission).";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode ApprovedByShareholders = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedByShareholders";
			definition = "Event is approved by shareholders.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode ApprovedByShareholdersAndSEC = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedByShareholdersAndSEC";
			definition = "Event is approved by SEC (Securities and Exchange Commission and shareholders.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode ApproximateRate = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApproximateRate";
			definition = "Event has approximate rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode AwaitingInformationFromCompany = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingInformationFromCompany";
			definition = "Awaiting information from company on the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode DayGracePeriod = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayGracePeriod";
			definition = "Event has day grace period.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode DistributionRejected = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionRejected";
			definition = "Event distribution was rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode SeeComments = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeeComments";
			definition = "Event has free form comments for review.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode HolidayInCountryofOrigin = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolidayInCountryofOrigin";
			definition = "Holiday in country of origin of the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode IssueNotFunded = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueNotFunded";
			definition = "Event issue is not funded.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode IssueTradingFlat = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueTradingFlat";
			definition = "Event issue is trading flat.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode LateAnnouncementWithElections = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncementWithElections";
			definition = "Event is a late announcement with elections.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode Liquidation = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			definition = "Event is a liquidation.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode PaidUponrReceiptOfFunds = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaidUponrReceiptOfFunds";
			definition = "Event proceeds will be paid upon receipt of funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode PendingConversionOfFunds = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConversionOfFunds";
			definition = "Event processed are pending conversion of funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode PendingEDSElections = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingEDSElections";
			definition = "Event is pending election dividend services elections.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode PendingSECApproval = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSECApproval";
			definition = "Event is pending SEC (Securities and Exchange Commission approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode PendingShareholderAndSECApproval = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingShareholderAndSECApproval";
			definition = "Event is pending SEC (Securities and Exchange Commission and shareholders approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
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
	public static final IssuerStatusCode PendingShareholderApproval = new IssuerStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingShareholderApproval";
			definition = "Event is pending shareholder approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerStatusCode.mmObject();
			codeName = "PSHA";
		}
	};
	final static private LinkedHashMap<String, IssuerStatusCode> codesByName = new LinkedHashMap<>();

	protected IssuerStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ASEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuerStatusCode";
				definition = "Specifies DTC (The Depository Trust Company) defined issuer status of the event.";
				derivation_lazy = () -> Arrays.asList(IssuerStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuerStatusCode.ApprovedBySEC, com.tools20022.repository.codeset.IssuerStatusCode.ApprovedByShareholders,
						com.tools20022.repository.codeset.IssuerStatusCode.ApprovedByShareholdersAndSEC, com.tools20022.repository.codeset.IssuerStatusCode.ApproximateRate,
						com.tools20022.repository.codeset.IssuerStatusCode.AwaitingInformationFromCompany, com.tools20022.repository.codeset.IssuerStatusCode.DayGracePeriod,
						com.tools20022.repository.codeset.IssuerStatusCode.DistributionRejected, com.tools20022.repository.codeset.IssuerStatusCode.SeeComments, com.tools20022.repository.codeset.IssuerStatusCode.HolidayInCountryofOrigin,
						com.tools20022.repository.codeset.IssuerStatusCode.IssueNotFunded, com.tools20022.repository.codeset.IssuerStatusCode.IssueTradingFlat,
						com.tools20022.repository.codeset.IssuerStatusCode.LateAnnouncementWithElections, com.tools20022.repository.codeset.IssuerStatusCode.Liquidation,
						com.tools20022.repository.codeset.IssuerStatusCode.PaidUponrReceiptOfFunds, com.tools20022.repository.codeset.IssuerStatusCode.PendingConversionOfFunds,
						com.tools20022.repository.codeset.IssuerStatusCode.PendingEDSElections, com.tools20022.repository.codeset.IssuerStatusCode.PendingSECApproval,
						com.tools20022.repository.codeset.IssuerStatusCode.PendingShareholderAndSECApproval, com.tools20022.repository.codeset.IssuerStatusCode.PendingShareholderApproval);
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

	public static IssuerStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IssuerStatusCode[] values() {
		IssuerStatusCode[] values = new IssuerStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IssuerStatusCode> {
		@Override
		public IssuerStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IssuerStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}