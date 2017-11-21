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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the tax calculation method to be used for the billing of the
 * services.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode#mmNoTaxes
 * BillingTaxCalculationMethodCode.mmNoTaxes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode#mmMethodA
 * BillingTaxCalculationMethodCode.mmMethodA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode#mmMethodB
 * BillingTaxCalculationMethodCode.mmMethodB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode#mmMethodC
 * BillingTaxCalculationMethodCode.mmMethodC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode#mmMethodD
 * BillingTaxCalculationMethodCode.mmMethodD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode#mmUndefined
 * BillingTaxCalculationMethodCode.mmUndefined}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code
 * BillingTaxCalculationMethod1Code}</li>
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
 * <li>"NTAX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingTaxCalculationMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the tax calculation method to be used for the billing of the services."
 * </li>
 * </ul>
 */
public class BillingTaxCalculationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No taxes are calculated or due on this account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode
	 * BillingTaxCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NTAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoTaxes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No taxes are calculated or due on this account."</li>
	 * </ul>
	 */
	public static final MMCode mmNoTaxes = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoTaxes";
			definition = "No taxes are calculated or due on this account.";
			owner_lazy = () -> BillingTaxCalculationMethodCode.mmObject();
			codeName = "NTAX";
		}
	};
	/**
	 * Line-by-line per service calculation and settlement currency translation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode
	 * BillingTaxCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line-by-line per service calculation and settlement currency translation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMethodA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodA";
			definition = "Line-by-line per service calculation and settlement currency translation.";
			owner_lazy = () -> BillingTaxCalculationMethodCode.mmObject();
			codeName = "MTDA";
		}
	};
	/**
	 * Line-by-line per service calculation with settlement currency translation
	 * performed on the statement tax total.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode
	 * BillingTaxCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line-by-line per service calculation with settlement currency translation performed on the statement tax total."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMethodB = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodB";
			definition = "Line-by-line per service calculation with settlement currency translation performed on the statement tax total.";
			owner_lazy = () -> BillingTaxCalculationMethodCode.mmObject();
			codeName = "MTDB";
		}
	};
	/**
	 * Group tax calculation with group settlement currency translation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode
	 * BillingTaxCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Group tax calculation with group settlement currency translation."</li>
	 * </ul>
	 */
	public static final MMCode mmMethodC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodC";
			definition = "Group tax calculation with group settlement currency translation.";
			owner_lazy = () -> BillingTaxCalculationMethodCode.mmObject();
			codeName = "MTDC";
		}
	};
	/**
	 * Line-by-line per service calculation with all charges and taxes due in
	 * the pricing currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode
	 * BillingTaxCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line-by-line per service calculation with all charges and taxes due in the pricing currency."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMethodD = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodD";
			definition = "Line-by-line per service calculation with all charges and taxes due in the pricing currency.";
			owner_lazy = () -> BillingTaxCalculationMethodCode.mmObject();
			codeName = "MTDD";
		}
	};
	/**
	 * Tax calculation method is not defined or unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethodCode
	 * BillingTaxCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UDFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undefined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax calculation method is not defined or unknown."</li>
	 * </ul>
	 */
	public static final MMCode mmUndefined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undefined";
			definition = "Tax calculation method is not defined or unknown.";
			owner_lazy = () -> BillingTaxCalculationMethodCode.mmObject();
			codeName = "UDFD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NTAX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingTaxCalculationMethodCode";
				definition = "Defines the tax calculation method to be used for the billing of the services.";
				code_lazy = () -> Arrays.asList(BillingTaxCalculationMethodCode.mmNoTaxes, BillingTaxCalculationMethodCode.mmMethodA, BillingTaxCalculationMethodCode.mmMethodB, BillingTaxCalculationMethodCode.mmMethodC,
						BillingTaxCalculationMethodCode.mmMethodD, BillingTaxCalculationMethodCode.mmUndefined);
				derivation_lazy = () -> Arrays.asList(BillingTaxCalculationMethod1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}