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
import com.tools20022.repository.codeset.TaxExemptReason3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason a specific tax has not been levied/deducted on a given
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#None
 * TaxExemptReason3Code.None}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#MaxiISA
 * TaxExemptReason3Code.MaxiISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#MiniCashISA
 * TaxExemptReason3Code.MiniCashISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#MiniStocksAndSharesISA
 * TaxExemptReason3Code.MiniStocksAndSharesISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#MiniInsuranceISA
 * TaxExemptReason3Code.MiniInsuranceISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#CurrentYearPayment
 * TaxExemptReason3Code.CurrentYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#PriorYearPayment
 * TaxExemptReason3Code.PriorYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#AssetTransfer
 * TaxExemptReason3Code.AssetTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EmployeePriorYear
 * TaxExemptReason3Code.EmployeePriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EmployeeCurrentYear
 * TaxExemptReason3Code.EmployeeCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EmployerPriorYear
 * TaxExemptReason3Code.EmployerPriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EmployerCurrentYear
 * TaxExemptReason3Code.EmployerCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#NonFundPrototypeIRA
 * TaxExemptReason3Code.NonFundPrototypeIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#NonFundQualifiedPlan
 * TaxExemptReason3Code.NonFundQualifiedPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#DefinedContributionPlan
 * TaxExemptReason3Code.DefinedContributionPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#IndividualRetirementAccount
 * TaxExemptReason3Code.IndividualRetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#IndividualRetirementAccountRollover
 * TaxExemptReason3Code.IndividualRetirementAccountRollover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#KEOGH
 * TaxExemptReason3Code.KEOGH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#ProfitSharingPlan
 * TaxExemptReason3Code.ProfitSharingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#FourHundredAndOneK
 * TaxExemptReason3Code.FourHundredAndOneK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#SelfDirectedIRA
 * TaxExemptReason3Code.SelfDirectedIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#FourHundredAndThreeB
 * TaxExemptReason3Code.FourHundredAndThreeB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#FourHundredFiftySeven
 * TaxExemptReason3Code.FourHundredFiftySeven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#RothIRAFundPrototype
 * TaxExemptReason3Code.RothIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#RothIRANonPrototype
 * TaxExemptReason3Code.RothIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#RothConversionIRAFundPrototype
 * TaxExemptReason3Code.RothConversionIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#RothConversionIRANonPrototype
 * TaxExemptReason3Code.RothConversionIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EducationIRAFundPrototype
 * TaxExemptReason3Code.EducationIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EducationIRANonPrototype
 * TaxExemptReason3Code.EducationIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#Foreigner
 * TaxExemptReason3Code.Foreigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#Incapacity
 * TaxExemptReason3Code.Incapacity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#Minor
 * TaxExemptReason3Code.Minor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#Association
 * TaxExemptReason3Code.Association}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#Diplomat
 * TaxExemptReason3Code.Diplomat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#Domestic
 * TaxExemptReason3Code.Domestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#OneOrBothForeign
 * TaxExemptReason3Code.OneOrBothForeign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#Ordinary
 * TaxExemptReason3Code.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#PensionFund
 * TaxExemptReason3Code.PensionFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#Refugee
 * TaxExemptReason3Code.Refugee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#RightsHolder
 * TaxExemptReason3Code.RightsHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#Administrator
 * TaxExemptReason3Code.Administrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#TwoNonResident
 * TaxExemptReason3Code.TwoNonResident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#OneNonResident
 * TaxExemptReason3Code.OneNonResident}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
 * TaxExemptReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxExemptReason3Code extends MMCode {

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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#None
	 * TaxExemptReason1Code.None}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code None = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			previousVersion_lazy = () -> TaxExemptReason1Code.None;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.None.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MaxiISA
	 * TaxExemptReason1Code.MaxiISA}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code MaxiISA = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaxiISA";
			previousVersion_lazy = () -> TaxExemptReason1Code.MaxiISA;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.MaxiISA.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniCashISA
	 * TaxExemptReason1Code.MiniCashISA}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code MiniCashISA = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniCashISA";
			previousVersion_lazy = () -> TaxExemptReason1Code.MiniCashISA;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.MiniCashISA.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniStocksAndSharesISA
	 * TaxExemptReason1Code.MiniStocksAndSharesISA}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code MiniStocksAndSharesISA = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniStocksAndSharesISA";
			previousVersion_lazy = () -> TaxExemptReason1Code.MiniStocksAndSharesISA;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.MiniStocksAndSharesISA.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniInsuranceISA
	 * TaxExemptReason1Code.MiniInsuranceISA}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code MiniInsuranceISA = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniInsuranceISA";
			previousVersion_lazy = () -> TaxExemptReason1Code.MiniInsuranceISA;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.MiniInsuranceISA.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#CurrentYearPayment
	 * TaxExemptReason1Code.CurrentYearPayment}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code CurrentYearPayment = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPayment";
			previousVersion_lazy = () -> TaxExemptReason1Code.CurrentYearPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.CurrentYearPayment.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#PriorYearPayment
	 * TaxExemptReason1Code.PriorYearPayment}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code PriorYearPayment = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorYearPayment";
			previousVersion_lazy = () -> TaxExemptReason1Code.PriorYearPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.PriorYearPayment.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#AssetTransfer
	 * TaxExemptReason1Code.AssetTransfer}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code AssetTransfer = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetTransfer";
			previousVersion_lazy = () -> TaxExemptReason1Code.AssetTransfer;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.AssetTransfer.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployeePriorYear
	 * TaxExemptReason1Code.EmployeePriorYear}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code EmployeePriorYear = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeePriorYear";
			previousVersion_lazy = () -> TaxExemptReason1Code.EmployeePriorYear;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.EmployeePriorYear.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployeeCurrentYear
	 * TaxExemptReason1Code.EmployeeCurrentYear}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code EmployeeCurrentYear = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeCurrentYear";
			previousVersion_lazy = () -> TaxExemptReason1Code.EmployeeCurrentYear;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.EmployeeCurrentYear.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployerPriorYear
	 * TaxExemptReason1Code.EmployerPriorYear}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code EmployerPriorYear = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerPriorYear";
			previousVersion_lazy = () -> TaxExemptReason1Code.EmployerPriorYear;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.EmployerPriorYear.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployerCurrentYear
	 * TaxExemptReason1Code.EmployerCurrentYear}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code EmployerCurrentYear = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerCurrentYear";
			previousVersion_lazy = () -> TaxExemptReason1Code.EmployerCurrentYear;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.EmployerCurrentYear.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#NonFundPrototypeIRA
	 * TaxExemptReason1Code.NonFundPrototypeIRA}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code NonFundPrototypeIRA = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundPrototypeIRA";
			previousVersion_lazy = () -> TaxExemptReason1Code.NonFundPrototypeIRA;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.NonFundPrototypeIRA.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#NonFundQualifiedPlan
	 * TaxExemptReason1Code.NonFundQualifiedPlan}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code NonFundQualifiedPlan = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundQualifiedPlan";
			previousVersion_lazy = () -> TaxExemptReason1Code.NonFundQualifiedPlan;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.NonFundQualifiedPlan.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#DefinedContributionPlan
	 * TaxExemptReason1Code.DefinedContributionPlan}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code DefinedContributionPlan = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinedContributionPlan";
			previousVersion_lazy = () -> TaxExemptReason1Code.DefinedContributionPlan;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.DefinedContributionPlan.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#IndividualRetirementAccount
	 * TaxExemptReason1Code.IndividualRetirementAccount}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code IndividualRetirementAccount = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccount";
			previousVersion_lazy = () -> TaxExemptReason1Code.IndividualRetirementAccount;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.IndividualRetirementAccount.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#IndividualRetirementAccountRollover
	 * TaxExemptReason1Code.IndividualRetirementAccountRollover}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code IndividualRetirementAccountRollover = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccountRollover";
			previousVersion_lazy = () -> TaxExemptReason1Code.IndividualRetirementAccountRollover;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.IndividualRetirementAccountRollover.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#KEOGH
	 * TaxExemptReason1Code.KEOGH}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code KEOGH = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEOGH";
			previousVersion_lazy = () -> TaxExemptReason1Code.KEOGH;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.KEOGH.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#ProfitSharingPlan
	 * TaxExemptReason1Code.ProfitSharingPlan}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code ProfitSharingPlan = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfitSharingPlan";
			previousVersion_lazy = () -> TaxExemptReason1Code.ProfitSharingPlan;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.ProfitSharingPlan.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredAndOneK
	 * TaxExemptReason1Code.FourHundredAndOneK}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code FourHundredAndOneK = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndOneK";
			previousVersion_lazy = () -> TaxExemptReason1Code.FourHundredAndOneK;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredAndOneK.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#SelfDirectedIRA
	 * TaxExemptReason1Code.SelfDirectedIRA}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code SelfDirectedIRA = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfDirectedIRA";
			previousVersion_lazy = () -> TaxExemptReason1Code.SelfDirectedIRA;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.SelfDirectedIRA.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredAndThreeB
	 * TaxExemptReason1Code.FourHundredAndThreeB}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code FourHundredAndThreeB = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndThreeB";
			previousVersion_lazy = () -> TaxExemptReason1Code.FourHundredAndThreeB;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredAndThreeB.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredFiftySeven
	 * TaxExemptReason1Code.FourHundredFiftySeven}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code FourHundredFiftySeven = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredFiftySeven";
			previousVersion_lazy = () -> TaxExemptReason1Code.FourHundredFiftySeven;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredFiftySeven.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothIRAFundPrototype
	 * TaxExemptReason1Code.RothIRAFundPrototype}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code RothIRAFundPrototype = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRAFundPrototype";
			previousVersion_lazy = () -> TaxExemptReason1Code.RothIRAFundPrototype;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.RothIRAFundPrototype.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothIRANonPrototype
	 * TaxExemptReason1Code.RothIRANonPrototype}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code RothIRANonPrototype = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRANonPrototype";
			previousVersion_lazy = () -> TaxExemptReason1Code.RothIRANonPrototype;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.RothIRANonPrototype.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothConversionIRAFundPrototype
	 * TaxExemptReason1Code.RothConversionIRAFundPrototype}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code RothConversionIRAFundPrototype = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRAFundPrototype";
			previousVersion_lazy = () -> TaxExemptReason1Code.RothConversionIRAFundPrototype;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.RothConversionIRAFundPrototype.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothConversionIRANonPrototype
	 * TaxExemptReason1Code.RothConversionIRANonPrototype}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code RothConversionIRANonPrototype = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRANonPrototype";
			previousVersion_lazy = () -> TaxExemptReason1Code.RothConversionIRANonPrototype;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.RothConversionIRANonPrototype.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EducationIRAFundPrototype
	 * TaxExemptReason1Code.EducationIRAFundPrototype}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code EducationIRAFundPrototype = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRAFundPrototype";
			previousVersion_lazy = () -> TaxExemptReason1Code.EducationIRAFundPrototype;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.EducationIRAFundPrototype.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EducationIRANonPrototype
	 * TaxExemptReason1Code.EducationIRANonPrototype}</li>
	 * </ul>
	 */
	public static final TaxExemptReason3Code EducationIRANonPrototype = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRANonPrototype";
			previousVersion_lazy = () -> TaxExemptReason1Code.EducationIRANonPrototype;
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.EducationIRANonPrototype.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code Foreigner = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foreigner";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.Foreigner.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code Incapacity = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incapacity";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.Incapacity.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code Minor = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Minor";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.Minor.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code Association = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Association";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.Association.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code Diplomat = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Diplomat";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.Diplomat.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code Domestic = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domestic";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.Domestic.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code OneOrBothForeign = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneOrBothForeign";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.OneOrBothForeign.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code Ordinary = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.Ordinary.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code PensionFund = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionFund";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.PensionFund.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code Refugee = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refugee";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.Refugee.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code RightsHolder = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolder";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.RightsHolder.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code Administrator = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.Administrator.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code TwoNonResident = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoNonResident";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.TwoNonResident.getCodeName().orElse(name);
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
	public static final TaxExemptReason3Code OneNonResident = new TaxExemptReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneNonResident";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason3Code.mmObject();
			codeName = TaxExemptReasonCode.OneNonResident.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxExemptReason3Code> codesByName = new LinkedHashMap<>();

	protected TaxExemptReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NONE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxExemptReason3Code";
				definition = "Specifies the reason a specific tax has not been levied/deducted on a given transaction.";
				previousVersion_lazy = () -> TaxExemptReason1Code.mmObject();
				trace_lazy = () -> TaxExemptReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxExemptReason3Code.None, com.tools20022.repository.codeset.TaxExemptReason3Code.MaxiISA,
						com.tools20022.repository.codeset.TaxExemptReason3Code.MiniCashISA, com.tools20022.repository.codeset.TaxExemptReason3Code.MiniStocksAndSharesISA,
						com.tools20022.repository.codeset.TaxExemptReason3Code.MiniInsuranceISA, com.tools20022.repository.codeset.TaxExemptReason3Code.CurrentYearPayment,
						com.tools20022.repository.codeset.TaxExemptReason3Code.PriorYearPayment, com.tools20022.repository.codeset.TaxExemptReason3Code.AssetTransfer,
						com.tools20022.repository.codeset.TaxExemptReason3Code.EmployeePriorYear, com.tools20022.repository.codeset.TaxExemptReason3Code.EmployeeCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason3Code.EmployerPriorYear, com.tools20022.repository.codeset.TaxExemptReason3Code.EmployerCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason3Code.NonFundPrototypeIRA, com.tools20022.repository.codeset.TaxExemptReason3Code.NonFundQualifiedPlan,
						com.tools20022.repository.codeset.TaxExemptReason3Code.DefinedContributionPlan, com.tools20022.repository.codeset.TaxExemptReason3Code.IndividualRetirementAccount,
						com.tools20022.repository.codeset.TaxExemptReason3Code.IndividualRetirementAccountRollover, com.tools20022.repository.codeset.TaxExemptReason3Code.KEOGH,
						com.tools20022.repository.codeset.TaxExemptReason3Code.ProfitSharingPlan, com.tools20022.repository.codeset.TaxExemptReason3Code.FourHundredAndOneK,
						com.tools20022.repository.codeset.TaxExemptReason3Code.SelfDirectedIRA, com.tools20022.repository.codeset.TaxExemptReason3Code.FourHundredAndThreeB,
						com.tools20022.repository.codeset.TaxExemptReason3Code.FourHundredFiftySeven, com.tools20022.repository.codeset.TaxExemptReason3Code.RothIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason3Code.RothIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason3Code.RothConversionIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason3Code.RothConversionIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason3Code.EducationIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason3Code.EducationIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason3Code.Foreigner, com.tools20022.repository.codeset.TaxExemptReason3Code.Incapacity,
						com.tools20022.repository.codeset.TaxExemptReason3Code.Minor, com.tools20022.repository.codeset.TaxExemptReason3Code.Association, com.tools20022.repository.codeset.TaxExemptReason3Code.Diplomat,
						com.tools20022.repository.codeset.TaxExemptReason3Code.Domestic, com.tools20022.repository.codeset.TaxExemptReason3Code.OneOrBothForeign, com.tools20022.repository.codeset.TaxExemptReason3Code.Ordinary,
						com.tools20022.repository.codeset.TaxExemptReason3Code.PensionFund, com.tools20022.repository.codeset.TaxExemptReason3Code.Refugee, com.tools20022.repository.codeset.TaxExemptReason3Code.RightsHolder,
						com.tools20022.repository.codeset.TaxExemptReason3Code.Administrator, com.tools20022.repository.codeset.TaxExemptReason3Code.TwoNonResident, com.tools20022.repository.codeset.TaxExemptReason3Code.OneNonResident);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(None.getCodeName().get(), None);
		codesByName.put(MaxiISA.getCodeName().get(), MaxiISA);
		codesByName.put(MiniCashISA.getCodeName().get(), MiniCashISA);
		codesByName.put(MiniStocksAndSharesISA.getCodeName().get(), MiniStocksAndSharesISA);
		codesByName.put(MiniInsuranceISA.getCodeName().get(), MiniInsuranceISA);
		codesByName.put(CurrentYearPayment.getCodeName().get(), CurrentYearPayment);
		codesByName.put(PriorYearPayment.getCodeName().get(), PriorYearPayment);
		codesByName.put(AssetTransfer.getCodeName().get(), AssetTransfer);
		codesByName.put(EmployeePriorYear.getCodeName().get(), EmployeePriorYear);
		codesByName.put(EmployeeCurrentYear.getCodeName().get(), EmployeeCurrentYear);
		codesByName.put(EmployerPriorYear.getCodeName().get(), EmployerPriorYear);
		codesByName.put(EmployerCurrentYear.getCodeName().get(), EmployerCurrentYear);
		codesByName.put(NonFundPrototypeIRA.getCodeName().get(), NonFundPrototypeIRA);
		codesByName.put(NonFundQualifiedPlan.getCodeName().get(), NonFundQualifiedPlan);
		codesByName.put(DefinedContributionPlan.getCodeName().get(), DefinedContributionPlan);
		codesByName.put(IndividualRetirementAccount.getCodeName().get(), IndividualRetirementAccount);
		codesByName.put(IndividualRetirementAccountRollover.getCodeName().get(), IndividualRetirementAccountRollover);
		codesByName.put(KEOGH.getCodeName().get(), KEOGH);
		codesByName.put(ProfitSharingPlan.getCodeName().get(), ProfitSharingPlan);
		codesByName.put(FourHundredAndOneK.getCodeName().get(), FourHundredAndOneK);
		codesByName.put(SelfDirectedIRA.getCodeName().get(), SelfDirectedIRA);
		codesByName.put(FourHundredAndThreeB.getCodeName().get(), FourHundredAndThreeB);
		codesByName.put(FourHundredFiftySeven.getCodeName().get(), FourHundredFiftySeven);
		codesByName.put(RothIRAFundPrototype.getCodeName().get(), RothIRAFundPrototype);
		codesByName.put(RothIRANonPrototype.getCodeName().get(), RothIRANonPrototype);
		codesByName.put(RothConversionIRAFundPrototype.getCodeName().get(), RothConversionIRAFundPrototype);
		codesByName.put(RothConversionIRANonPrototype.getCodeName().get(), RothConversionIRANonPrototype);
		codesByName.put(EducationIRAFundPrototype.getCodeName().get(), EducationIRAFundPrototype);
		codesByName.put(EducationIRANonPrototype.getCodeName().get(), EducationIRANonPrototype);
		codesByName.put(Foreigner.getCodeName().get(), Foreigner);
		codesByName.put(Incapacity.getCodeName().get(), Incapacity);
		codesByName.put(Minor.getCodeName().get(), Minor);
		codesByName.put(Association.getCodeName().get(), Association);
		codesByName.put(Diplomat.getCodeName().get(), Diplomat);
		codesByName.put(Domestic.getCodeName().get(), Domestic);
		codesByName.put(OneOrBothForeign.getCodeName().get(), OneOrBothForeign);
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(PensionFund.getCodeName().get(), PensionFund);
		codesByName.put(Refugee.getCodeName().get(), Refugee);
		codesByName.put(RightsHolder.getCodeName().get(), RightsHolder);
		codesByName.put(Administrator.getCodeName().get(), Administrator);
		codesByName.put(TwoNonResident.getCodeName().get(), TwoNonResident);
		codesByName.put(OneNonResident.getCodeName().get(), OneNonResident);
	}

	public static TaxExemptReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxExemptReason3Code[] values() {
		TaxExemptReason3Code[] values = new TaxExemptReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxExemptReason3Code> {
		@Override
		public TaxExemptReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxExemptReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}