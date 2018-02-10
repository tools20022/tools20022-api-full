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
import com.tools20022.repository.codeset.UKTaxGroupUnit1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the UK tax group to which units belong. For UK tax, the first
 * dividend that an investor receives from a funds investment is deemed to be
 * part income and part return of capital. The capital element is
 * 'equalisation', and is exempt from income tax.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UKTaxGroupUnit1Code#Group1
 * UKTaxGroupUnit1Code.Group1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UKTaxGroupUnit1Code#Group2
 * UKTaxGroupUnit1Code.Group2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnitCode
 * UKTaxGroupUnitCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UKTaxGroupUnit1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the UK tax group to which units belong. For UK tax, the first dividend that an investor receives from a funds investment is deemed to be part income and part return of capital. The capital element is 'equalisation', and is exempt from income tax."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UKTaxGroupUnit1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnit1Code
	 * UKTaxGroupUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1"</li>
	 * </ul>
	 */
	public static final UKTaxGroupUnit1Code Group1 = new UKTaxGroupUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group1";
			owner_lazy = () -> com.tools20022.repository.codeset.UKTaxGroupUnit1Code.mmObject();
			codeName = UKTaxGroupUnitCode.Group1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnit1Code
	 * UKTaxGroupUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group2"</li>
	 * </ul>
	 */
	public static final UKTaxGroupUnit1Code Group2 = new UKTaxGroupUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group2";
			owner_lazy = () -> com.tools20022.repository.codeset.UKTaxGroupUnit1Code.mmObject();
			codeName = UKTaxGroupUnitCode.Group2.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UKTaxGroupUnit1Code> codesByName = new LinkedHashMap<>();

	protected UKTaxGroupUnit1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UKTaxGroupUnit1Code";
				definition = "Specifies the UK tax group to which units belong. For UK tax, the first dividend that an investor receives from a funds investment is deemed to be part income and part return of capital. The capital element is 'equalisation', and is exempt from income tax.";
				trace_lazy = () -> UKTaxGroupUnitCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UKTaxGroupUnit1Code.Group1, com.tools20022.repository.codeset.UKTaxGroupUnit1Code.Group2);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Group1.getCodeName().get(), Group1);
		codesByName.put(Group2.getCodeName().get(), Group2);
	}

	public static UKTaxGroupUnit1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UKTaxGroupUnit1Code[] values() {
		UKTaxGroupUnit1Code[] values = new UKTaxGroupUnit1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UKTaxGroupUnit1Code> {
		@Override
		public UKTaxGroupUnit1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UKTaxGroupUnit1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}