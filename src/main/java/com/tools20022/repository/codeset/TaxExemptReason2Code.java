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
import com.tools20022.repository.codeset.TaxExemptReason2Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#None
 * TaxExemptReason2Code.None}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#MaxiISA
 * TaxExemptReason2Code.MaxiISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#MiniCashISA
 * TaxExemptReason2Code.MiniCashISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#MiniStocksAndSharesISA
 * TaxExemptReason2Code.MiniStocksAndSharesISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#MiniInsuranceISA
 * TaxExemptReason2Code.MiniInsuranceISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#CurrentYearPayment
 * TaxExemptReason2Code.CurrentYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#PriorYearPayment
 * TaxExemptReason2Code.PriorYearPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#AssetTransfer
 * TaxExemptReason2Code.AssetTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#EmployeePriorYear
 * TaxExemptReason2Code.EmployeePriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#EmployeeCurrentYear
 * TaxExemptReason2Code.EmployeeCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#EmployerPriorYear
 * TaxExemptReason2Code.EmployerPriorYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#EmployerCurrentYear
 * TaxExemptReason2Code.EmployerCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#NonFundPrototypeIRA
 * TaxExemptReason2Code.NonFundPrototypeIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#NonFundQualifiedPlan
 * TaxExemptReason2Code.NonFundQualifiedPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#DefinedContributionPlan
 * TaxExemptReason2Code.DefinedContributionPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#IndividualRetirementAccount
 * TaxExemptReason2Code.IndividualRetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#IndividualRetirementAccountRollover
 * TaxExemptReason2Code.IndividualRetirementAccountRollover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#KEOGH
 * TaxExemptReason2Code.KEOGH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#ProfitSharingPlan
 * TaxExemptReason2Code.ProfitSharingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#FourHundredAndOneK
 * TaxExemptReason2Code.FourHundredAndOneK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#SelfDirectedIRA
 * TaxExemptReason2Code.SelfDirectedIRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#FourHundredAndThreeB
 * TaxExemptReason2Code.FourHundredAndThreeB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#FourHundredFiftySeven
 * TaxExemptReason2Code.FourHundredFiftySeven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#RothIRAFundPrototype
 * TaxExemptReason2Code.RothIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#RothIRANonPrototype
 * TaxExemptReason2Code.RothIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#RothConversionIRAFundPrototype
 * TaxExemptReason2Code.RothConversionIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#RothConversionIRANonPrototype
 * TaxExemptReason2Code.RothConversionIRANonPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#EducationIRAFundPrototype
 * TaxExemptReason2Code.EducationIRAFundPrototype}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#EducationIRANonPrototype
 * TaxExemptReason2Code.EducationIRANonPrototype}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code#Other
 * TaxExemptReason2Code.Other}</li>
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
 * "TaxExemptReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason a specific tax has not been levied/deducted on a given transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxExemptReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code None = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.None.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaxiISA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code MaxiISA = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaxiISA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.MaxiISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniCashISA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code MiniCashISA = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniCashISA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.MiniCashISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniStocksAndSharesISA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code MiniStocksAndSharesISA = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniStocksAndSharesISA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.MiniStocksAndSharesISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniInsuranceISA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code MiniInsuranceISA = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniInsuranceISA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.MiniInsuranceISA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearPayment"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code CurrentYearPayment = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.CurrentYearPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorYearPayment"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code PriorYearPayment = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorYearPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.PriorYearPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetTransfer"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code AssetTransfer = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.AssetTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeePriorYear"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code EmployeePriorYear = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeePriorYear";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.EmployeePriorYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeCurrentYear"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code EmployeeCurrentYear = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeCurrentYear";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.EmployeeCurrentYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerPriorYear"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code EmployerPriorYear = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerPriorYear";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.EmployerPriorYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployerCurrentYear"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code EmployerCurrentYear = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployerCurrentYear";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.EmployerCurrentYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundPrototypeIRA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code NonFundPrototypeIRA = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundPrototypeIRA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.NonFundPrototypeIRA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFundQualifiedPlan"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code NonFundQualifiedPlan = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFundQualifiedPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.NonFundQualifiedPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinedContributionPlan"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code DefinedContributionPlan = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinedContributionPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.DefinedContributionPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccount"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code IndividualRetirementAccount = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.IndividualRetirementAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRetirementAccountRollover"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code IndividualRetirementAccountRollover = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRetirementAccountRollover";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.IndividualRetirementAccountRollover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KEOGH"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code KEOGH = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEOGH";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.KEOGH.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfitSharingPlan"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code ProfitSharingPlan = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfitSharingPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.ProfitSharingPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndOneK"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code FourHundredAndOneK = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndOneK";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredAndOneK.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfDirectedIRA"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code SelfDirectedIRA = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfDirectedIRA";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.SelfDirectedIRA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredAndThreeB"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code FourHundredAndThreeB = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredAndThreeB";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredAndThreeB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourHundredFiftySeven"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code FourHundredFiftySeven = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourHundredFiftySeven";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.FourHundredFiftySeven.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRAFundPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code RothIRAFundPrototype = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRAFundPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.RothIRAFundPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothIRANonPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code RothIRANonPrototype = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothIRANonPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.RothIRANonPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRAFundPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code RothConversionIRAFundPrototype = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRAFundPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.RothConversionIRAFundPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RothConversionIRANonPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code RothConversionIRANonPrototype = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RothConversionIRANonPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.RothConversionIRANonPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRAFundPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code EducationIRAFundPrototype = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRAFundPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.EducationIRAFundPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationIRANonPrototype"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code EducationIRANonPrototype = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationIRANonPrototype";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.EducationIRANonPrototype.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason2Code
	 * TaxExemptReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final TaxExemptReason2Code Other = new TaxExemptReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxExemptReason2Code.mmObject();
			codeName = TaxExemptReasonCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxExemptReason2Code> codesByName = new LinkedHashMap<>();

	protected TaxExemptReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NONE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxExemptReason2Code";
				definition = "Specifies the reason a specific tax has not been levied/deducted on a given transaction.";
				trace_lazy = () -> TaxExemptReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxExemptReason2Code.None, com.tools20022.repository.codeset.TaxExemptReason2Code.MaxiISA,
						com.tools20022.repository.codeset.TaxExemptReason2Code.MiniCashISA, com.tools20022.repository.codeset.TaxExemptReason2Code.MiniStocksAndSharesISA,
						com.tools20022.repository.codeset.TaxExemptReason2Code.MiniInsuranceISA, com.tools20022.repository.codeset.TaxExemptReason2Code.CurrentYearPayment,
						com.tools20022.repository.codeset.TaxExemptReason2Code.PriorYearPayment, com.tools20022.repository.codeset.TaxExemptReason2Code.AssetTransfer,
						com.tools20022.repository.codeset.TaxExemptReason2Code.EmployeePriorYear, com.tools20022.repository.codeset.TaxExemptReason2Code.EmployeeCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason2Code.EmployerPriorYear, com.tools20022.repository.codeset.TaxExemptReason2Code.EmployerCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReason2Code.NonFundPrototypeIRA, com.tools20022.repository.codeset.TaxExemptReason2Code.NonFundQualifiedPlan,
						com.tools20022.repository.codeset.TaxExemptReason2Code.DefinedContributionPlan, com.tools20022.repository.codeset.TaxExemptReason2Code.IndividualRetirementAccount,
						com.tools20022.repository.codeset.TaxExemptReason2Code.IndividualRetirementAccountRollover, com.tools20022.repository.codeset.TaxExemptReason2Code.KEOGH,
						com.tools20022.repository.codeset.TaxExemptReason2Code.ProfitSharingPlan, com.tools20022.repository.codeset.TaxExemptReason2Code.FourHundredAndOneK,
						com.tools20022.repository.codeset.TaxExemptReason2Code.SelfDirectedIRA, com.tools20022.repository.codeset.TaxExemptReason2Code.FourHundredAndThreeB,
						com.tools20022.repository.codeset.TaxExemptReason2Code.FourHundredFiftySeven, com.tools20022.repository.codeset.TaxExemptReason2Code.RothIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason2Code.RothIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason2Code.RothConversionIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason2Code.RothConversionIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason2Code.EducationIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReason2Code.EducationIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReason2Code.Other);
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
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static TaxExemptReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxExemptReason2Code[] values() {
		TaxExemptReason2Code[] values = new TaxExemptReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxExemptReason2Code> {
		@Override
		public TaxExemptReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxExemptReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}