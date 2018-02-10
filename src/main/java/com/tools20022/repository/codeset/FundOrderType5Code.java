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
import com.tools20022.repository.codeset.FundOrderType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the category of the investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType5Code#NormalStaffPortion
 * FundOrderType5Code.NormalStaffPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType5Code#NormalClientPortion
 * FundOrderType5Code.NormalClientPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType5Code#StaffWithSavingsPlan
 * FundOrderType5Code.StaffWithSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType5Code#ClientWithSavingsPlan
 * FundOrderType5Code.ClientWithSavingsPlan}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
 * FundOrderTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NSPN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundOrderType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of the investment fund order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundOrderType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType5Code
	 * FundOrderType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalStaffPortion"</li>
	 * </ul>
	 */
	public static final FundOrderType5Code NormalStaffPortion = new FundOrderType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalStaffPortion";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType5Code.mmObject();
			codeName = FundOrderTypeCode.NormalStaffPortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType5Code
	 * FundOrderType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalClientPortion"</li>
	 * </ul>
	 */
	public static final FundOrderType5Code NormalClientPortion = new FundOrderType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalClientPortion";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType5Code.mmObject();
			codeName = FundOrderTypeCode.NormalClientPortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType5Code
	 * FundOrderType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StaffWithSavingsPlan"</li>
	 * </ul>
	 */
	public static final FundOrderType5Code StaffWithSavingsPlan = new FundOrderType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StaffWithSavingsPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType5Code.mmObject();
			codeName = FundOrderTypeCode.StaffWithSavingsPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType5Code
	 * FundOrderType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientWithSavingsPlan"</li>
	 * </ul>
	 */
	public static final FundOrderType5Code ClientWithSavingsPlan = new FundOrderType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientWithSavingsPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType5Code.mmObject();
			codeName = FundOrderTypeCode.ClientWithSavingsPlan.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FundOrderType5Code> codesByName = new LinkedHashMap<>();

	protected FundOrderType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NSPN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOrderType5Code";
				definition = "Specifies the category of the investment fund order.";
				trace_lazy = () -> FundOrderTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundOrderType5Code.NormalStaffPortion, com.tools20022.repository.codeset.FundOrderType5Code.NormalClientPortion,
						com.tools20022.repository.codeset.FundOrderType5Code.StaffWithSavingsPlan, com.tools20022.repository.codeset.FundOrderType5Code.ClientWithSavingsPlan);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NormalStaffPortion.getCodeName().get(), NormalStaffPortion);
		codesByName.put(NormalClientPortion.getCodeName().get(), NormalClientPortion);
		codesByName.put(StaffWithSavingsPlan.getCodeName().get(), StaffWithSavingsPlan);
		codesByName.put(ClientWithSavingsPlan.getCodeName().get(), ClientWithSavingsPlan);
	}

	public static FundOrderType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundOrderType5Code[] values() {
		FundOrderType5Code[] values = new FundOrderType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundOrderType5Code> {
		@Override
		public FundOrderType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundOrderType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}