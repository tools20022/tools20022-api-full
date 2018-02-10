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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.InterestComputationMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method used to compute accruing interest of a financial
 * instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#IC30360ISDAor30360AmericanBasicRule
 * InterestComputationMethod1Code.IC30360ISDAor30360AmericanBasicRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#IC30365
 * InterestComputationMethod1Code.IC30365}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#IC30Actual
 * InterestComputationMethod1Code.IC30Actual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#Actual360
 * InterestComputationMethod1Code.Actual360}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#Actual365Fixed
 * InterestComputationMethod1Code.Actual365Fixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#ActualActualICMA
 * InterestComputationMethod1Code.ActualActualICMA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#IC30E360orEuroBondBasismodel1
 * InterestComputationMethod1Code.IC30E360orEuroBondBasismodel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#ActualActualISDA
 * InterestComputationMethod1Code.ActualActualISDA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#Actual365LorActuActubasisRule
 * InterestComputationMethod1Code.Actual365LorActuActubasisRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#ActualActualAFB
 * InterestComputationMethod1Code.ActualActualAFB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#IC30360ICMAor30360basicrule
 * InterestComputationMethod1Code.IC30360ICMAor30360basicrule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#IC30E2360orEurobondbasismodel2
 * InterestComputationMethod1Code.IC30E2360orEurobondbasismodel2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#IC30E3360orEurobondbasismodel3
 * InterestComputationMethod1Code.IC30E3360orEurobondbasismodel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code#Actual365NL
 * InterestComputationMethod1Code.Actual365NL}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
 * InterestComputationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::MICO</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"A001"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestComputationMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method used to compute accruing interest of a financial instrument."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InterestComputationMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30360ISDAor30360AmericanBasicRule"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code IC30360ISDAor30360AmericanBasicRule = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30360ISDAor30360AmericanBasicRule";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.IC30360ISDAor30360AmericanBasicRule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30365"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code IC30365 = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30365";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.IC30365.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30Actual"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code IC30Actual = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30Actual";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.IC30Actual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual360"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code Actual360 = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual360";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.Actual360.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365Fixed"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code Actual365Fixed = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual365Fixed";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.Actual365Fixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualICMA"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code ActualActualICMA = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualICMA";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.ActualActualICMA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E360orEuroBondBasismodel1"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code IC30E360orEuroBondBasismodel1 = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E360orEuroBondBasismodel1";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.IC30E360orEuroBondBasismodel1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualISDA"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code ActualActualISDA = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualISDA";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.ActualActualISDA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365LorActuActubasisRule"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code Actual365LorActuActubasisRule = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual365LorActuActubasisRule";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.Actual365LorActuActubasisRule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualAFB"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code ActualActualAFB = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualAFB";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.ActualActualAFB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30360ICMAor30360basicrule"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code IC30360ICMAor30360basicrule = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30360ICMAor30360basicrule";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.IC30360ICMAor30360basicrule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E2360orEurobondbasismodel2"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code IC30E2360orEurobondbasismodel2 = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E2360orEurobondbasismodel2";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.IC30E2360orEurobondbasismodel2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E3360orEurobondbasismodel3"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code IC30E3360orEurobondbasismodel3 = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E3360orEurobondbasismodel3";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.IC30E3360orEurobondbasismodel3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod1Code
	 * InterestComputationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365NL"</li>
	 * </ul>
	 */
	public static final InterestComputationMethod1Code Actual365NL = new InterestComputationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual365NL";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestComputationMethod1Code.mmObject();
			codeName = InterestComputationMethodCode.Actual365NL.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InterestComputationMethod1Code> codesByName = new LinkedHashMap<>();

	protected InterestComputationMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MICO"));
				example = Arrays.asList("A001");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestComputationMethod1Code";
				definition = "Specifies the method used to compute accruing interest of a financial instrument.";
				trace_lazy = () -> InterestComputationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestComputationMethod1Code.IC30360ISDAor30360AmericanBasicRule, com.tools20022.repository.codeset.InterestComputationMethod1Code.IC30365,
						com.tools20022.repository.codeset.InterestComputationMethod1Code.IC30Actual, com.tools20022.repository.codeset.InterestComputationMethod1Code.Actual360,
						com.tools20022.repository.codeset.InterestComputationMethod1Code.Actual365Fixed, com.tools20022.repository.codeset.InterestComputationMethod1Code.ActualActualICMA,
						com.tools20022.repository.codeset.InterestComputationMethod1Code.IC30E360orEuroBondBasismodel1, com.tools20022.repository.codeset.InterestComputationMethod1Code.ActualActualISDA,
						com.tools20022.repository.codeset.InterestComputationMethod1Code.Actual365LorActuActubasisRule, com.tools20022.repository.codeset.InterestComputationMethod1Code.ActualActualAFB,
						com.tools20022.repository.codeset.InterestComputationMethod1Code.IC30360ICMAor30360basicrule, com.tools20022.repository.codeset.InterestComputationMethod1Code.IC30E2360orEurobondbasismodel2,
						com.tools20022.repository.codeset.InterestComputationMethod1Code.IC30E3360orEurobondbasismodel3, com.tools20022.repository.codeset.InterestComputationMethod1Code.Actual365NL);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IC30360ISDAor30360AmericanBasicRule.getCodeName().get(), IC30360ISDAor30360AmericanBasicRule);
		codesByName.put(IC30365.getCodeName().get(), IC30365);
		codesByName.put(IC30Actual.getCodeName().get(), IC30Actual);
		codesByName.put(Actual360.getCodeName().get(), Actual360);
		codesByName.put(Actual365Fixed.getCodeName().get(), Actual365Fixed);
		codesByName.put(ActualActualICMA.getCodeName().get(), ActualActualICMA);
		codesByName.put(IC30E360orEuroBondBasismodel1.getCodeName().get(), IC30E360orEuroBondBasismodel1);
		codesByName.put(ActualActualISDA.getCodeName().get(), ActualActualISDA);
		codesByName.put(Actual365LorActuActubasisRule.getCodeName().get(), Actual365LorActuActubasisRule);
		codesByName.put(ActualActualAFB.getCodeName().get(), ActualActualAFB);
		codesByName.put(IC30360ICMAor30360basicrule.getCodeName().get(), IC30360ICMAor30360basicrule);
		codesByName.put(IC30E2360orEurobondbasismodel2.getCodeName().get(), IC30E2360orEurobondbasismodel2);
		codesByName.put(IC30E3360orEurobondbasismodel3.getCodeName().get(), IC30E3360orEurobondbasismodel3);
		codesByName.put(Actual365NL.getCodeName().get(), Actual365NL);
	}

	public static InterestComputationMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InterestComputationMethod1Code[] values() {
		InterestComputationMethod1Code[] values = new InterestComputationMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InterestComputationMethod1Code> {
		@Override
		public InterestComputationMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InterestComputationMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}