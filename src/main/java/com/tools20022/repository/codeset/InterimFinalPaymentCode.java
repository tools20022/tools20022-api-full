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
import com.tools20022.repository.codeset.InterimFinalPaymentCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies payment type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterimFinalPaymentCode#Interim
 * InterimFinalPaymentCode.Interim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterimFinalPaymentCode#Final
 * InterimFinalPaymentCode.Final}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InterimFinalPayment1Code
 * InterimFinalPayment1Code}</li>
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
 * <li>"INTE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterimFinalPaymentCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies payment type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InterimFinalPaymentCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Interim payment. Pending possible future payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterimFinalPaymentCode
	 * InterimFinalPaymentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interim payment. Pending possible future payments."</li>
	 * </ul>
	 */
	public static final InterimFinalPaymentCode Interim = new InterimFinalPaymentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			definition = "Interim payment. Pending possible future payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterimFinalPaymentCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Final payment positions will be debited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterimFinalPaymentCode
	 * InterimFinalPaymentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final payment positions will be debited."</li>
	 * </ul>
	 */
	public static final InterimFinalPaymentCode Final = new InterimFinalPaymentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Final payment positions will be debited.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterimFinalPaymentCode.mmObject();
			codeName = "FINL";
		}
	};
	final static private LinkedHashMap<String, InterimFinalPaymentCode> codesByName = new LinkedHashMap<>();

	protected InterimFinalPaymentCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INTE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterimFinalPaymentCode";
				definition = "Specifies payment type.";
				derivation_lazy = () -> Arrays.asList(InterimFinalPayment1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterimFinalPaymentCode.Interim, com.tools20022.repository.codeset.InterimFinalPaymentCode.Final);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Final.getCodeName().get(), Final);
	}

	public static InterimFinalPaymentCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InterimFinalPaymentCode[] values() {
		InterimFinalPaymentCode[] values = new InterimFinalPaymentCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InterimFinalPaymentCode> {
		@Override
		public InterimFinalPaymentCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InterimFinalPaymentCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}