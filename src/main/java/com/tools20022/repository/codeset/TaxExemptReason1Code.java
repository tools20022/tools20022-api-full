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
import com.tools20022.repository.codeset.TaxExemptReason1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#None
 * TaxExemptReason1Code.None}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MaxiISA
 * TaxExemptReason1Code.MaxiISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniCashISA
 * TaxExemptReason1Code.MiniCashISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniStocksAndSharesISA
 * TaxExemptReason1Code.MiniStocksAndSharesISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#MiniInsuranceISA
 * TaxExemptReason1Code.MiniInsuranceISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#CurrentYearPayment
 * TaxExemptReason1Code.CurrentYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#PriorYearPayment
 * TaxExemptReason1Code.PriorYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#AssetTransfer
 * TaxExemptReason1Code.AssetTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployeePriorYear
 * TaxExemptReason1Code.EmployeePriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployeeCurrentYear
 * TaxExemptReason1Code.EmployeeCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployerPriorYear
 * TaxExemptReason1Code.EmployerPriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EmployerCurrentYear
 * TaxExemptReason1Code.EmployerCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#NonFundPrototypeIRA
 * TaxExemptReason1Code.NonFundPrototypeIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#NonFundQualifiedPlan
 * TaxExemptReason1Code.NonFundQualifiedPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#DefinedContributionPlan
 * TaxExemptReason1Code.DefinedContributionPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#IndividualRetirementAccount
 * TaxExemptReason1Code.IndividualRetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#IndividualRetirementAccountRollover
 * TaxExemptReason1Code.IndividualRetirementAccountRollover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#KEOGH
 * TaxExemptReason1Code.KEOGH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#ProfitSharingPlan
 * TaxExemptReason1Code.ProfitSharingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredAndOneK
 * TaxExemptReason1Code.FourHundredAndOneK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#SelfDirectedIRA
 * TaxExemptReason1Code.SelfDirectedIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredAndThreeB
 * TaxExemptReason1Code.FourHundredAndThreeB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#FourHundredFiftySeven
 * TaxExemptReason1Code.FourHundredFiftySeven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothIRAFundPrototype
 * TaxExemptReason1Code.RothIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothIRANonPrototype
 * TaxExemptReason1Code.RothIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothConversionIRAFundPrototype
 * TaxExemptReason1Code.RothConversionIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#RothConversionIRANonPrototype
 * TaxExemptReason1Code.RothConversionIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EducationIRAFundPrototype
 * TaxExemptReason1Code.EducationIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code#EducationIRANonPrototype
 * TaxExemptReason1Code.EducationIRANonPrototype}</li>
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
 * "TaxExemptReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason a specific tax has not been levied/deducted on a given transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code
 * TaxExemptReason3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxExemptReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#None
	 * TaxExemptReason3Code.None}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code None = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.None);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.None.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaxiISA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#MaxiISA
	 * TaxExemptReason3Code.MaxiISA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code MaxiISA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaxiISA";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.MaxiISA);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.MaxiISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniCashISA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#MiniCashISA
	 * TaxExemptReason3Code.MiniCashISA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code MiniCashISA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniCashISA";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.MiniCashISA);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.MiniCashISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniStocksAndSharesISA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#MiniStocksAndSharesISA
	 * TaxExemptReason3Code.MiniStocksAndSharesISA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code MiniStocksAndSharesISA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniStocksAndSharesISA";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.MiniStocksAndSharesISA);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.MiniStocksAndSharesISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniInsuranceISA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#MiniInsuranceISA
	 * TaxExemptReason3Code.MiniInsuranceISA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code MiniInsuranceISA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniInsuranceISA";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.MiniInsuranceISA);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.MiniInsuranceISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#CurrentYearPayment
	 * TaxExemptReason3Code.CurrentYearPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code CurrentYearPayment = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPayment";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.CurrentYearPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.CurrentYearPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorYearPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#PriorYearPayment
	 * TaxExemptReason3Code.PriorYearPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code PriorYearPayment = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorYearPayment";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.PriorYearPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.PriorYearPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetTransfer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#AssetTransfer
	 * TaxExemptReason3Code.AssetTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code AssetTransfer = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetTransfer";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.AssetTransfer);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.AssetTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeePriorYear"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EmployeePriorYear
	 * TaxExemptReason3Code.EmployeePriorYear}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EmployeePriorYear = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeePriorYear";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.EmployeePriorYear);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EmployeePriorYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeCurrentYear"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EmployeeCurrentYear
	 * TaxExemptReason3Code.EmployeeCurrentYear}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EmployeeCurrentYear = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeCurrentYear";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.EmployeeCurrentYear);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EmployeeCurrentYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerPriorYear"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EmployerPriorYear
	 * TaxExemptReason3Code.EmployerPriorYear}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EmployerPriorYear = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerPriorYear";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.EmployerPriorYear);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EmployerPriorYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerCurrentYear"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EmployerCurrentYear
	 * TaxExemptReason3Code.EmployerCurrentYear}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EmployerCurrentYear = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerCurrentYear";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.EmployerCurrentYear);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EmployerCurrentYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundPrototypeIRA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#NonFundPrototypeIRA
	 * TaxExemptReason3Code.NonFundPrototypeIRA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code NonFundPrototypeIRA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundPrototypeIRA";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.NonFundPrototypeIRA);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.NonFundPrototypeIRA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundQualifiedPlan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#NonFundQualifiedPlan
	 * TaxExemptReason3Code.NonFundQualifiedPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code NonFundQualifiedPlan = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundQualifiedPlan";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.NonFundQualifiedPlan);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.NonFundQualifiedPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinedContributionPlan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#DefinedContributionPlan
	 * TaxExemptReason3Code.DefinedContributionPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code DefinedContributionPlan = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinedContributionPlan";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.DefinedContributionPlan);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.DefinedContributionPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#IndividualRetirementAccount
	 * TaxExemptReason3Code.IndividualRetirementAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code IndividualRetirementAccount = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccount";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.IndividualRetirementAccount);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.IndividualRetirementAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccountRollover"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#IndividualRetirementAccountRollover
	 * TaxExemptReason3Code.IndividualRetirementAccountRollover}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code IndividualRetirementAccountRollover = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccountRollover";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.IndividualRetirementAccountRollover);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.IndividualRetirementAccountRollover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KEOGH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#KEOGH
	 * TaxExemptReason3Code.KEOGH}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code KEOGH = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEOGH";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.KEOGH);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.KEOGH.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfitSharingPlan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#ProfitSharingPlan
	 * TaxExemptReason3Code.ProfitSharingPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code ProfitSharingPlan = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfitSharingPlan";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.ProfitSharingPlan);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.ProfitSharingPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndOneK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#FourHundredAndOneK
	 * TaxExemptReason3Code.FourHundredAndOneK}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code FourHundredAndOneK = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndOneK";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.FourHundredAndOneK);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredAndOneK.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfDirectedIRA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#SelfDirectedIRA
	 * TaxExemptReason3Code.SelfDirectedIRA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code SelfDirectedIRA = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfDirectedIRA";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.SelfDirectedIRA);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.SelfDirectedIRA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndThreeB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#FourHundredAndThreeB
	 * TaxExemptReason3Code.FourHundredAndThreeB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code FourHundredAndThreeB = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndThreeB";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.FourHundredAndThreeB);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredAndThreeB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredFiftySeven"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#FourHundredFiftySeven
	 * TaxExemptReason3Code.FourHundredFiftySeven}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code FourHundredFiftySeven = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredFiftySeven";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.FourHundredFiftySeven);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredFiftySeven.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRAFundPrototype"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#RothIRAFundPrototype
	 * TaxExemptReason3Code.RothIRAFundPrototype}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code RothIRAFundPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRAFundPrototype";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.RothIRAFundPrototype);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.RothIRAFundPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRANonPrototype"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#RothIRANonPrototype
	 * TaxExemptReason3Code.RothIRANonPrototype}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code RothIRANonPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRANonPrototype";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.RothIRANonPrototype);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.RothIRANonPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRAFundPrototype"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#RothConversionIRAFundPrototype
	 * TaxExemptReason3Code.RothConversionIRAFundPrototype}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code RothConversionIRAFundPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRAFundPrototype";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.RothConversionIRAFundPrototype);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.RothConversionIRAFundPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRANonPrototype"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#RothConversionIRANonPrototype
	 * TaxExemptReason3Code.RothConversionIRANonPrototype}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code RothConversionIRANonPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRANonPrototype";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.RothConversionIRANonPrototype);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.RothConversionIRANonPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRAFundPrototype"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EducationIRAFundPrototype
	 * TaxExemptReason3Code.EducationIRAFundPrototype}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EducationIRAFundPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRAFundPrototype";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.EducationIRAFundPrototype);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EducationIRAFundPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRANonPrototype"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason3Code#EducationIRANonPrototype
	 * TaxExemptReason3Code.EducationIRANonPrototype}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TaxExemptReason1Code EducationIRANonPrototype = new TaxExemptReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRANonPrototype";
			nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.EducationIRANonPrototype);
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason1Code.mmObject();
			codeName = TaxExemptReasonCode.EducationIRANonPrototype.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxExemptReason1Code> codesByName = new LinkedHashMap<>();

	protected TaxExemptReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NONE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxExemptReason1Code";
				definition = "Specifies the reason a specific tax has not been levied/deducted on a given transaction.";
				nextVersions_lazy = () -> Arrays.asList(TaxExemptReason3Code.mmObject());
				trace_lazy = () -> TaxExemptReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxExemptReason1Code.None, com.tools20022.repository.codeset.TaxExemptReason1Code.MaxiISA,
						com.tools20022.repository.codeset.TaxExemptReason1Code.MiniCashISA, com.tools20022.repository.codeset.TaxExemptReason1Code.MiniStocksAndSharesISA,
						com.tools20022.repository.codeset.TaxExemptReason1Code.MiniInsuranceISA, com.tools20022.repository.codeset.TaxExemptReason1Code.CurrentYearPayment,
						com.tools20022.repository.codeset.TaxExemptReason1Code.PriorYearPayment, com.tools20022.repository.codeset.TaxExemptReason1Code.AssetTransfer,
						com.tools20022.repository.codeset.TaxExemptReason1Code.EmployeePriorYear, com.tools20022.repository.codeset.TaxExemptReason1Code.EmployeeCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason1Code.EmployerPriorYear, com.tools20022.repository.codeset.TaxExemptReason1Code.EmployerCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason1Code.NonFundPrototypeIRA, com.tools20022.repository.codeset.TaxExemptReason1Code.NonFundQualifiedPlan,
						com.tools20022.repository.codeset.TaxExemptReason1Code.DefinedContributionPlan, com.tools20022.repository.codeset.TaxExemptReason1Code.IndividualRetirementAccount,
						com.tools20022.repository.codeset.TaxExemptReason1Code.IndividualRetirementAccountRollover, com.tools20022.repository.codeset.TaxExemptReason1Code.KEOGH,
						com.tools20022.repository.codeset.TaxExemptReason1Code.ProfitSharingPlan, com.tools20022.repository.codeset.TaxExemptReason1Code.FourHundredAndOneK,
						com.tools20022.repository.codeset.TaxExemptReason1Code.SelfDirectedIRA, com.tools20022.repository.codeset.TaxExemptReason1Code.FourHundredAndThreeB,
						com.tools20022.repository.codeset.TaxExemptReason1Code.FourHundredFiftySeven, com.tools20022.repository.codeset.TaxExemptReason1Code.RothIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason1Code.RothIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason1Code.RothConversionIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason1Code.RothConversionIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason1Code.EducationIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason1Code.EducationIRANonPrototype);
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
	}

	public static TaxExemptReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxExemptReason1Code[] values() {
		TaxExemptReason1Code[] values = new TaxExemptReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxExemptReason1Code> {
		@Override
		public TaxExemptReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxExemptReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}