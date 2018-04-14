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
import com.tools20022.repository.codeset.LegSwapType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of leg structuring a swap. For fixed income, it is used to
 * requests the respondent to calculate the quantity based on the quantity on
 * the opposite side of the swap.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.LegSwapType1Code#ParForPar
 * LegSwapType1Code.ParForPar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegSwapType1Code#ModifiedDuration
 * LegSwapType1Code.ModifiedDuration}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LegSwapType1Code#Risk
 * LegSwapType1Code.Risk}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.LegSwapType1Code#Proceeds
 * LegSwapType1Code.Proceeds}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LegSwapTypeCode
 * LegSwapTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LegSwapType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of leg structuring a swap. For fixed income, it is used to requests the respondent to calculate the quantity based on the quantity on the opposite side of the swap."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PFPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LegSwapType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapType1Code
	 * LegSwapType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParForPar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LegSwapType1Code ParForPar = new LegSwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParForPar";
			owner_lazy = () -> com.tools20022.repository.codeset.LegSwapType1Code.mmObject();
			codeName = LegSwapTypeCode.ParForPar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapType1Code
	 * LegSwapType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedDuration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LegSwapType1Code ModifiedDuration = new LegSwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedDuration";
			owner_lazy = () -> com.tools20022.repository.codeset.LegSwapType1Code.mmObject();
			codeName = LegSwapTypeCode.ModifiedDuration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapType1Code
	 * LegSwapType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Risk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LegSwapType1Code Risk = new LegSwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Risk";
			owner_lazy = () -> com.tools20022.repository.codeset.LegSwapType1Code.mmObject();
			codeName = LegSwapTypeCode.Risk.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegSwapType1Code
	 * LegSwapType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LegSwapType1Code Proceeds = new LegSwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.LegSwapType1Code.mmObject();
			codeName = LegSwapTypeCode.Proceeds.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LegSwapType1Code> codesByName = new LinkedHashMap<>();

	protected LegSwapType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PFPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LegSwapType1Code";
				definition = "Indicates the type of leg structuring a swap. For fixed income, it is used to requests the respondent to calculate the quantity based on the quantity on the opposite side of the swap.";
				trace_lazy = () -> LegSwapTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegSwapType1Code.ParForPar, com.tools20022.repository.codeset.LegSwapType1Code.ModifiedDuration, com.tools20022.repository.codeset.LegSwapType1Code.Risk,
						com.tools20022.repository.codeset.LegSwapType1Code.Proceeds);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ParForPar.getCodeName().get(), ParForPar);
		codesByName.put(ModifiedDuration.getCodeName().get(), ModifiedDuration);
		codesByName.put(Risk.getCodeName().get(), Risk);
		codesByName.put(Proceeds.getCodeName().get(), Proceeds);
	}

	public static LegSwapType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LegSwapType1Code[] values() {
		LegSwapType1Code[] values = new LegSwapType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LegSwapType1Code> {
		@Override
		public LegSwapType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LegSwapType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}