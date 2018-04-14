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
import com.tools20022.repository.codeset.InstalmentPlan1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of instalment plan.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstalmentPlan1Code#EqualPayment
 * InstalmentPlan1Code.EqualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstalmentPlan1Code#InequalPayment
 * InstalmentPlan1Code.InequalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstalmentPlan1Code#DeferredInstalment
 * InstalmentPlan1Code.DeferredInstalment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstalmentPlanCode
 * InstalmentPlanCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstalmentPlan1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of instalment plan."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstalmentPlan1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstalmentPlan1Code
	 * InstalmentPlan1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InstalmentPlan1Code EqualPayment = new InstalmentPlan1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.InstalmentPlan1Code.mmObject();
			codeName = InstalmentPlanCode.EqualPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstalmentPlan1Code
	 * InstalmentPlan1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InequalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InstalmentPlan1Code InequalPayment = new InstalmentPlan1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InequalPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.InstalmentPlan1Code.mmObject();
			codeName = InstalmentPlanCode.InequalPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstalmentPlan1Code
	 * InstalmentPlan1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InstalmentPlan1Code DeferredInstalment = new InstalmentPlan1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredInstalment";
			owner_lazy = () -> com.tools20022.repository.codeset.InstalmentPlan1Code.mmObject();
			codeName = InstalmentPlanCode.DeferredInstalment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InstalmentPlan1Code> codesByName = new LinkedHashMap<>();

	protected InstalmentPlan1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstalmentPlan1Code";
				definition = "Type of instalment plan.";
				trace_lazy = () -> InstalmentPlanCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstalmentPlan1Code.EqualPayment, com.tools20022.repository.codeset.InstalmentPlan1Code.InequalPayment,
						com.tools20022.repository.codeset.InstalmentPlan1Code.DeferredInstalment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EqualPayment.getCodeName().get(), EqualPayment);
		codesByName.put(InequalPayment.getCodeName().get(), InequalPayment);
		codesByName.put(DeferredInstalment.getCodeName().get(), DeferredInstalment);
	}

	public static InstalmentPlan1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstalmentPlan1Code[] values() {
		InstalmentPlan1Code[] values = new InstalmentPlan1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstalmentPlan1Code> {
		@Override
		public InstalmentPlan1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstalmentPlan1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}