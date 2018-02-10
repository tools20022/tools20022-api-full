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
import com.tools20022.repository.codeset.DayCountFraction1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code#Actual360
 * DayCountFraction1Code.Actual360}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code#Actual365Fixed
 * DayCountFraction1Code.Actual365Fixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code#ActualActualAFB
 * DayCountFraction1Code.ActualActualAFB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code#IC30E3360orEurobondbasismodel3
 * DayCountFraction1Code.IC30E3360orEurobondbasismodel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code#IC30360ICMAor30360basicrule
 * DayCountFraction1Code.IC30360ICMAor30360basicrule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code#ActualActualISDA
 * DayCountFraction1Code.ActualActualISDA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code#ActualActualICMA
 * DayCountFraction1Code.ActualActualICMA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code#IC30E360orEuroBondBasismodel1
 * DayCountFraction1Code.IC30E360orEuroBondBasismodel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code#Other
 * DayCountFraction1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
 * DayCountFractionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DayCountFraction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method used to compute accruing interest of a financial instrument."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DayCountFraction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual360"</li>
	 * </ul>
	 */
	public static final DayCountFraction1Code Actual360 = new DayCountFraction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual360";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFraction1Code.mmObject();
			codeName = DayCountFractionCode.Actual360.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365Fixed"</li>
	 * </ul>
	 */
	public static final DayCountFraction1Code Actual365Fixed = new DayCountFraction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual365Fixed";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFraction1Code.mmObject();
			codeName = DayCountFractionCode.Actual365Fixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualAFB"</li>
	 * </ul>
	 */
	public static final DayCountFraction1Code ActualActualAFB = new DayCountFraction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualAFB";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFraction1Code.mmObject();
			codeName = DayCountFractionCode.ActualActualAFB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E3360orEurobondbasismodel3"</li>
	 * </ul>
	 */
	public static final DayCountFraction1Code IC30E3360orEurobondbasismodel3 = new DayCountFraction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E3360orEurobondbasismodel3";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFraction1Code.mmObject();
			codeName = DayCountFractionCode.IC30E3360orEurobondbasismodel3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30360ICMAor30360basicrule"</li>
	 * </ul>
	 */
	public static final DayCountFraction1Code IC30360ICMAor30360basicrule = new DayCountFraction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30360ICMAor30360basicrule";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFraction1Code.mmObject();
			codeName = DayCountFractionCode.IC30360ICMAor30360basicrule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualISDA"</li>
	 * </ul>
	 */
	public static final DayCountFraction1Code ActualActualISDA = new DayCountFraction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualISDA";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFraction1Code.mmObject();
			codeName = DayCountFractionCode.ActualActualISDA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualICMA"</li>
	 * </ul>
	 */
	public static final DayCountFraction1Code ActualActualICMA = new DayCountFraction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualICMA";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFraction1Code.mmObject();
			codeName = DayCountFractionCode.ActualActualICMA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E360orEuroBondBasismodel1"</li>
	 * </ul>
	 */
	public static final DayCountFraction1Code IC30E360orEuroBondBasismodel1 = new DayCountFraction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E360orEuroBondBasismodel1";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFraction1Code.mmObject();
			codeName = DayCountFractionCode.IC30E360orEuroBondBasismodel1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
	 * DayCountFraction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final DayCountFraction1Code Other = new DayCountFraction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFraction1Code.mmObject();
			codeName = DayCountFractionCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DayCountFraction1Code> codesByName = new LinkedHashMap<>();

	protected DayCountFraction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DayCountFraction1Code";
				definition = "Specifies the method used to compute accruing interest of a financial instrument.";
				trace_lazy = () -> DayCountFractionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DayCountFraction1Code.Actual360, com.tools20022.repository.codeset.DayCountFraction1Code.Actual365Fixed,
						com.tools20022.repository.codeset.DayCountFraction1Code.ActualActualAFB, com.tools20022.repository.codeset.DayCountFraction1Code.IC30E3360orEurobondbasismodel3,
						com.tools20022.repository.codeset.DayCountFraction1Code.IC30360ICMAor30360basicrule, com.tools20022.repository.codeset.DayCountFraction1Code.ActualActualISDA,
						com.tools20022.repository.codeset.DayCountFraction1Code.ActualActualICMA, com.tools20022.repository.codeset.DayCountFraction1Code.IC30E360orEuroBondBasismodel1,
						com.tools20022.repository.codeset.DayCountFraction1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Actual360.getCodeName().get(), Actual360);
		codesByName.put(Actual365Fixed.getCodeName().get(), Actual365Fixed);
		codesByName.put(ActualActualAFB.getCodeName().get(), ActualActualAFB);
		codesByName.put(IC30E3360orEurobondbasismodel3.getCodeName().get(), IC30E3360orEurobondbasismodel3);
		codesByName.put(IC30360ICMAor30360basicrule.getCodeName().get(), IC30360ICMAor30360basicrule);
		codesByName.put(ActualActualISDA.getCodeName().get(), ActualActualISDA);
		codesByName.put(ActualActualICMA.getCodeName().get(), ActualActualICMA);
		codesByName.put(IC30E360orEuroBondBasismodel1.getCodeName().get(), IC30E360orEuroBondBasismodel1);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static DayCountFraction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DayCountFraction1Code[] values() {
		DayCountFraction1Code[] values = new DayCountFraction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DayCountFraction1Code> {
		@Override
		public DayCountFraction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DayCountFraction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}