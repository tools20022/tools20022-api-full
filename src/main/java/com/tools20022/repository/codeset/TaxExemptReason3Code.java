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
import com.tools20022.repository.codeset.TaxExemptReasonCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason a specific tax has not been levied/deducted on a given
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
 * TaxExemptReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmNone
 * TaxExemptReason3Code.mmNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmMaxiISA
 * TaxExemptReason3Code.mmMaxiISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmMiniCashISA
 * TaxExemptReason3Code.mmMiniCashISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmMiniStocksAndSharesISA
 * TaxExemptReason3Code.mmMiniStocksAndSharesISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmMiniInsuranceISA
 * TaxExemptReason3Code.mmMiniInsuranceISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmCurrentYearPayment
 * TaxExemptReason3Code.mmCurrentYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmPriorYearPayment
 * TaxExemptReason3Code.mmPriorYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmAssetTransfer
 * TaxExemptReason3Code.mmAssetTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmEmployeePriorYear
 * TaxExemptReason3Code.mmEmployeePriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmEmployeeCurrentYear
 * TaxExemptReason3Code.mmEmployeeCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmEmployerPriorYear
 * TaxExemptReason3Code.mmEmployerPriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmEmployerCurrentYear
 * TaxExemptReason3Code.mmEmployerCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmNonFundPrototypeIRA
 * TaxExemptReason3Code.mmNonFundPrototypeIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmNonFundQualifiedPlan
 * TaxExemptReason3Code.mmNonFundQualifiedPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmDefinedContributionPlan
 * TaxExemptReason3Code.mmDefinedContributionPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmIndividualRetirementAccount
 * TaxExemptReason3Code.mmIndividualRetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmIndividualRetirementAccountRollover
 * TaxExemptReason3Code.mmIndividualRetirementAccountRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmKEOGH
 * TaxExemptReason3Code.mmKEOGH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmProfitSharingPlan
 * TaxExemptReason3Code.mmProfitSharingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmFourHundredAndOneK
 * TaxExemptReason3Code.mmFourHundredAndOneK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmSelfDirectedIRA
 * TaxExemptReason3Code.mmSelfDirectedIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmFourHundredAndThreeB
 * TaxExemptReason3Code.mmFourHundredAndThreeB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmFourHundredFiftySeven
 * TaxExemptReason3Code.mmFourHundredFiftySeven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmRothIRAFundPrototype
 * TaxExemptReason3Code.mmRothIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmRothIRANonPrototype
 * TaxExemptReason3Code.mmRothIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmRothConversionIRAFundPrototype
 * TaxExemptReason3Code.mmRothConversionIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmRothConversionIRANonPrototype
 * TaxExemptReason3Code.mmRothConversionIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmEducationIRAFundPrototype
 * TaxExemptReason3Code.mmEducationIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmEducationIRANonPrototype
 * TaxExemptReason3Code.mmEducationIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmForeigner
 * TaxExemptReason3Code.mmForeigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmIncapacity
 * TaxExemptReason3Code.mmIncapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmMinor
 * TaxExemptReason3Code.mmMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmAssociation
 * TaxExemptReason3Code.mmAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmDiplomat
 * TaxExemptReason3Code.mmDiplomat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmDomestic
 * TaxExemptReason3Code.mmDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmOneOrBothForeign
 * TaxExemptReason3Code.mmOneOrBothForeign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmOrdinary
 * TaxExemptReason3Code.mmOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmPensionFund
 * TaxExemptReason3Code.mmPensionFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmRefugee
 * TaxExemptReason3Code.mmRefugee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmRightsHolder
 * TaxExemptReason3Code.mmRightsHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmAdministrator
 * TaxExemptReason3Code.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmTwoNonResident
 * TaxExemptReason3Code.mmTwoNonResident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#mmOneNonResident
 * TaxExemptReason3Code.mmOneNonResident}</li>
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
 * <li>"NONE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxExemptReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason a specific tax has not been levied/deducted on a given transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
 * TaxExemptReason1Code}</li>
 * </ul>
 */
public class TaxExemptReason3Code extends TaxExemptReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmNone
	 * TaxExemptReason1Code.mmNone}</li>
	 * </ul>
	 */
	public static final MMCode mmNone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmNone;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaxiISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmMaxiISA
	 * TaxExemptReason1Code.mmMaxiISA}</li>
	 * </ul>
	 */
	public static final MMCode mmMaxiISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaxiISA";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmMaxiISA;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniCashISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmMiniCashISA
	 * TaxExemptReason1Code.mmMiniCashISA}</li>
	 * </ul>
	 */
	public static final MMCode mmMiniCashISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniCashISA";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmMiniCashISA;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniStocksAndSharesISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmMiniStocksAndSharesISA
	 * TaxExemptReason1Code.mmMiniStocksAndSharesISA}</li>
	 * </ul>
	 */
	public static final MMCode mmMiniStocksAndSharesISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniStocksAndSharesISA";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmMiniStocksAndSharesISA;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniInsuranceISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmMiniInsuranceISA
	 * TaxExemptReason1Code.mmMiniInsuranceISA}</li>
	 * </ul>
	 */
	public static final MMCode mmMiniInsuranceISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniInsuranceISA";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmMiniInsuranceISA;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmCurrentYearPayment
	 * TaxExemptReason1Code.mmCurrentYearPayment}</li>
	 * </ul>
	 */
	public static final MMCode mmCurrentYearPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPayment";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmCurrentYearPayment;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorYearPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmPriorYearPayment
	 * TaxExemptReason1Code.mmPriorYearPayment}</li>
	 * </ul>
	 */
	public static final MMCode mmPriorYearPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorYearPayment";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmPriorYearPayment;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmAssetTransfer
	 * TaxExemptReason1Code.mmAssetTransfer}</li>
	 * </ul>
	 */
	public static final MMCode mmAssetTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetTransfer";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmAssetTransfer;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeePriorYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmEmployeePriorYear
	 * TaxExemptReason1Code.mmEmployeePriorYear}</li>
	 * </ul>
	 */
	public static final MMCode mmEmployeePriorYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeePriorYear";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmEmployeePriorYear;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeCurrentYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmEmployeeCurrentYear
	 * TaxExemptReason1Code.mmEmployeeCurrentYear}</li>
	 * </ul>
	 */
	public static final MMCode mmEmployeeCurrentYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeCurrentYear";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmEmployeeCurrentYear;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerPriorYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmEmployerPriorYear
	 * TaxExemptReason1Code.mmEmployerPriorYear}</li>
	 * </ul>
	 */
	public static final MMCode mmEmployerPriorYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerPriorYear";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmEmployerPriorYear;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerCurrentYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmEmployerCurrentYear
	 * TaxExemptReason1Code.mmEmployerCurrentYear}</li>
	 * </ul>
	 */
	public static final MMCode mmEmployerCurrentYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerCurrentYear";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmEmployerCurrentYear;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundPrototypeIRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmNonFundPrototypeIRA
	 * TaxExemptReason1Code.mmNonFundPrototypeIRA}</li>
	 * </ul>
	 */
	public static final MMCode mmNonFundPrototypeIRA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundPrototypeIRA";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmNonFundPrototypeIRA;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundQualifiedPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmNonFundQualifiedPlan
	 * TaxExemptReason1Code.mmNonFundQualifiedPlan}</li>
	 * </ul>
	 */
	public static final MMCode mmNonFundQualifiedPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundQualifiedPlan";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmNonFundQualifiedPlan;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinedContributionPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmDefinedContributionPlan
	 * TaxExemptReason1Code.mmDefinedContributionPlan}</li>
	 * </ul>
	 */
	public static final MMCode mmDefinedContributionPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinedContributionPlan";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmDefinedContributionPlan;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmIndividualRetirementAccount
	 * TaxExemptReason1Code.mmIndividualRetirementAccount}</li>
	 * </ul>
	 */
	public static final MMCode mmIndividualRetirementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmIndividualRetirementAccount;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccountRollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmIndividualRetirementAccountRollover
	 * TaxExemptReason1Code.mmIndividualRetirementAccountRollover}</li>
	 * </ul>
	 */
	public static final MMCode mmIndividualRetirementAccountRollover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccountRollover";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmIndividualRetirementAccountRollover;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KEOGH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmKEOGH
	 * TaxExemptReason1Code.mmKEOGH}</li>
	 * </ul>
	 */
	public static final MMCode mmKEOGH = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEOGH";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmKEOGH;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfitSharingPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmProfitSharingPlan
	 * TaxExemptReason1Code.mmProfitSharingPlan}</li>
	 * </ul>
	 */
	public static final MMCode mmProfitSharingPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfitSharingPlan";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmProfitSharingPlan;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndOneK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmFourHundredAndOneK
	 * TaxExemptReason1Code.mmFourHundredAndOneK}</li>
	 * </ul>
	 */
	public static final MMCode mmFourHundredAndOneK = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndOneK";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmFourHundredAndOneK;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfDirectedIRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmSelfDirectedIRA
	 * TaxExemptReason1Code.mmSelfDirectedIRA}</li>
	 * </ul>
	 */
	public static final MMCode mmSelfDirectedIRA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfDirectedIRA";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmSelfDirectedIRA;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndThreeB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmFourHundredAndThreeB
	 * TaxExemptReason1Code.mmFourHundredAndThreeB}</li>
	 * </ul>
	 */
	public static final MMCode mmFourHundredAndThreeB = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndThreeB";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmFourHundredAndThreeB;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredFiftySeven"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmFourHundredFiftySeven
	 * TaxExemptReason1Code.mmFourHundredFiftySeven}</li>
	 * </ul>
	 */
	public static final MMCode mmFourHundredFiftySeven = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredFiftySeven";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmFourHundredFiftySeven;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRAFundPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmRothIRAFundPrototype
	 * TaxExemptReason1Code.mmRothIRAFundPrototype}</li>
	 * </ul>
	 */
	public static final MMCode mmRothIRAFundPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRAFundPrototype";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmRothIRAFundPrototype;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRANonPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmRothIRANonPrototype
	 * TaxExemptReason1Code.mmRothIRANonPrototype}</li>
	 * </ul>
	 */
	public static final MMCode mmRothIRANonPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRANonPrototype";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmRothIRANonPrototype;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRAFundPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmRothConversionIRAFundPrototype
	 * TaxExemptReason1Code.mmRothConversionIRAFundPrototype}</li>
	 * </ul>
	 */
	public static final MMCode mmRothConversionIRAFundPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRAFundPrototype";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmRothConversionIRAFundPrototype;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRANonPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmRothConversionIRANonPrototype
	 * TaxExemptReason1Code.mmRothConversionIRANonPrototype}</li>
	 * </ul>
	 */
	public static final MMCode mmRothConversionIRANonPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRANonPrototype";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmRothConversionIRANonPrototype;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRAFundPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmEducationIRAFundPrototype
	 * TaxExemptReason1Code.mmEducationIRAFundPrototype}</li>
	 * </ul>
	 */
	public static final MMCode mmEducationIRAFundPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRAFundPrototype";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmEducationIRAFundPrototype;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRANonPrototype"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#mmEducationIRANonPrototype
	 * TaxExemptReason1Code.mmEducationIRANonPrototype}</li>
	 * </ul>
	 */
	public static final MMCode mmEducationIRANonPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRANonPrototype";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmEducationIRANonPrototype;
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Foreigner"</li>
	 * </ul>
	 */
	public static final MMCode mmForeigner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foreigner";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incapacity"</li>
	 * </ul>
	 */
	public static final MMCode mmIncapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incapacity";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Minor"</li>
	 * </ul>
	 */
	public static final MMCode mmMinor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Minor";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Association"</li>
	 * </ul>
	 */
	public static final MMCode mmAssociation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Association";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Diplomat"</li>
	 * </ul>
	 */
	public static final MMCode mmDiplomat = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Diplomat";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domestic"</li>
	 * </ul>
	 */
	public static final MMCode mmDomestic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domestic";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneOrBothForeign"</li>
	 * </ul>
	 */
	public static final MMCode mmOneOrBothForeign = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneOrBothForeign";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * </ul>
	 */
	public static final MMCode mmOrdinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFund"</li>
	 * </ul>
	 */
	public static final MMCode mmPensionFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionFund";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refugee"</li>
	 * </ul>
	 */
	public static final MMCode mmRefugee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refugee";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolder"</li>
	 * </ul>
	 */
	public static final MMCode mmRightsHolder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolder";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Administrator"</li>
	 * </ul>
	 */
	public static final MMCode mmAdministrator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoNonResident"</li>
	 * </ul>
	 */
	public static final MMCode mmTwoNonResident = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoNonResident";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
	 * TaxExemptReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneNonResident"</li>
	 * </ul>
	 */
	public static final MMCode mmOneNonResident = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneNonResident";
			owner_lazy = () -> TaxExemptReason3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("NONE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxExemptReason3Code";
				definition = "Specifies the reason a specific tax has not been levied/deducted on a given transaction.";
				previousVersion_lazy = () -> TaxExemptReason1Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxExemptReason3Code.mmNone, com.tools20022.repository.codeset.TaxExemptReason3Code.mmMaxiISA,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmMiniCashISA, com.tools20022.repository.codeset.TaxExemptReason3Code.mmMiniStocksAndSharesISA,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmMiniInsuranceISA, com.tools20022.repository.codeset.TaxExemptReason3Code.mmCurrentYearPayment,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmPriorYearPayment, com.tools20022.repository.codeset.TaxExemptReason3Code.mmAssetTransfer,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmEmployeePriorYear, com.tools20022.repository.codeset.TaxExemptReason3Code.mmEmployeeCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmEmployerPriorYear, com.tools20022.repository.codeset.TaxExemptReason3Code.mmEmployerCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmNonFundPrototypeIRA, com.tools20022.repository.codeset.TaxExemptReason3Code.mmNonFundQualifiedPlan,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmDefinedContributionPlan, com.tools20022.repository.codeset.TaxExemptReason3Code.mmIndividualRetirementAccount,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmIndividualRetirementAccountRollover, com.tools20022.repository.codeset.TaxExemptReason3Code.mmKEOGH,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmProfitSharingPlan, com.tools20022.repository.codeset.TaxExemptReason3Code.mmFourHundredAndOneK,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmSelfDirectedIRA, com.tools20022.repository.codeset.TaxExemptReason3Code.mmFourHundredAndThreeB,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmFourHundredFiftySeven, com.tools20022.repository.codeset.TaxExemptReason3Code.mmRothIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmRothIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason3Code.mmRothConversionIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmRothConversionIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason3Code.mmEducationIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmEducationIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason3Code.mmForeigner,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmIncapacity, com.tools20022.repository.codeset.TaxExemptReason3Code.mmMinor, com.tools20022.repository.codeset.TaxExemptReason3Code.mmAssociation,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmDiplomat, com.tools20022.repository.codeset.TaxExemptReason3Code.mmDomestic, com.tools20022.repository.codeset.TaxExemptReason3Code.mmOneOrBothForeign,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmOrdinary, com.tools20022.repository.codeset.TaxExemptReason3Code.mmPensionFund, com.tools20022.repository.codeset.TaxExemptReason3Code.mmRefugee,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmRightsHolder, com.tools20022.repository.codeset.TaxExemptReason3Code.mmAdministrator, com.tools20022.repository.codeset.TaxExemptReason3Code.mmTwoNonResident,
						com.tools20022.repository.codeset.TaxExemptReason3Code.mmOneNonResident);
				trace_lazy = () -> TaxExemptReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}