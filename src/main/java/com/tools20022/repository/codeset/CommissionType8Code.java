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
import com.tools20022.repository.codeset.CommissionType8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Used to identify soft trades at order entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code#StepOut
 * CommissionType8Code.StepOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code#Regular
 * CommissionType8Code.Regular}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CommissionType8Code#StepIn
 * CommissionType8Code.StepIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code#SoftDollar
 * CommissionType8Code.SoftDollar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code#SoftDollarStepIn
 * CommissionType8Code.SoftDollarStepIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code#SoftDollarStepOut
 * CommissionType8Code.SoftDollarStepOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code#PlanSponsor
 * CommissionType8Code.PlanSponsor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
 * CommissionTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"STEP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommissionType8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Used to identify soft trades at order entry."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommissionType8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code
	 * CommissionType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepOut"</li>
	 * </ul>
	 */
	public static final CommissionType8Code StepOut = new CommissionType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepOut";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType8Code.mmObject();
			codeName = CommissionTypeV2Code.StepOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code
	 * CommissionType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * </ul>
	 */
	public static final CommissionType8Code Regular = new CommissionType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType8Code.mmObject();
			codeName = CommissionTypeV2Code.Regular.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code
	 * CommissionType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepIn"</li>
	 * </ul>
	 */
	public static final CommissionType8Code StepIn = new CommissionType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepIn";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType8Code.mmObject();
			codeName = CommissionTypeV2Code.StepIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code
	 * CommissionType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollar"</li>
	 * </ul>
	 */
	public static final CommissionType8Code SoftDollar = new CommissionType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftDollar";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType8Code.mmObject();
			codeName = CommissionTypeV2Code.SoftDollar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code
	 * CommissionType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollarStepIn"</li>
	 * </ul>
	 */
	public static final CommissionType8Code SoftDollarStepIn = new CommissionType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftDollarStepIn";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType8Code.mmObject();
			codeName = CommissionTypeV2Code.SoftDollarStepIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code
	 * CommissionType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollarStepOut"</li>
	 * </ul>
	 */
	public static final CommissionType8Code SoftDollarStepOut = new CommissionType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftDollarStepOut";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType8Code.mmObject();
			codeName = CommissionTypeV2Code.SoftDollarStepOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code
	 * CommissionType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlanSponsor"</li>
	 * </ul>
	 */
	public static final CommissionType8Code PlanSponsor = new CommissionType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlanSponsor";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType8Code.mmObject();
			codeName = CommissionTypeV2Code.PlanSponsor.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CommissionType8Code> codesByName = new LinkedHashMap<>();

	protected CommissionType8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("STEP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommissionType8Code";
				definition = "Used to identify soft trades at order entry.";
				trace_lazy = () -> CommissionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommissionType8Code.StepOut, com.tools20022.repository.codeset.CommissionType8Code.Regular, com.tools20022.repository.codeset.CommissionType8Code.StepIn,
						com.tools20022.repository.codeset.CommissionType8Code.SoftDollar, com.tools20022.repository.codeset.CommissionType8Code.SoftDollarStepIn, com.tools20022.repository.codeset.CommissionType8Code.SoftDollarStepOut,
						com.tools20022.repository.codeset.CommissionType8Code.PlanSponsor);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StepOut.getCodeName().get(), StepOut);
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(StepIn.getCodeName().get(), StepIn);
		codesByName.put(SoftDollar.getCodeName().get(), SoftDollar);
		codesByName.put(SoftDollarStepIn.getCodeName().get(), SoftDollarStepIn);
		codesByName.put(SoftDollarStepOut.getCodeName().get(), SoftDollarStepOut);
		codesByName.put(PlanSponsor.getCodeName().get(), PlanSponsor);
	}

	public static CommissionType8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommissionType8Code[] values() {
		CommissionType8Code[] values = new CommissionType8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommissionType8Code> {
		@Override
		public CommissionType8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommissionType8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}