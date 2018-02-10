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
import com.tools20022.repository.codeset.WithholdingTaxRateType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of withholding tax rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateType1Code#BackUpWithholding
 * WithholdingTaxRateType1Code.BackUpWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateType1Code#FATCATax
 * WithholdingTaxRateType1Code.FATCATax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateType1Code#NRATax
 * WithholdingTaxRateType1Code.NRATax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode
 * WithholdingTaxRateTypeCode}</li>
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
 * "WithholdingTaxRateType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of withholding tax rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WithholdingTaxRateType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateType1Code
	 * WithholdingTaxRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackUpWithholding"</li>
	 * </ul>
	 */
	public static final WithholdingTaxRateType1Code BackUpWithholding = new WithholdingTaxRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUpWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.WithholdingTaxRateType1Code.mmObject();
			codeName = WithholdingTaxRateTypeCode.BackUpWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateType1Code
	 * WithholdingTaxRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCATax"</li>
	 * </ul>
	 */
	public static final WithholdingTaxRateType1Code FATCATax = new WithholdingTaxRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCATax";
			owner_lazy = () -> com.tools20022.repository.codeset.WithholdingTaxRateType1Code.mmObject();
			codeName = WithholdingTaxRateTypeCode.FATCATax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateType1Code
	 * WithholdingTaxRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NRATax"</li>
	 * </ul>
	 */
	public static final WithholdingTaxRateType1Code NRATax = new WithholdingTaxRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATax";
			owner_lazy = () -> com.tools20022.repository.codeset.WithholdingTaxRateType1Code.mmObject();
			codeName = WithholdingTaxRateTypeCode.NRATax.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, WithholdingTaxRateType1Code> codesByName = new LinkedHashMap<>();

	protected WithholdingTaxRateType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WithholdingTaxRateType1Code";
				definition = "Specifies the type of withholding tax rate.";
				trace_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WithholdingTaxRateType1Code.BackUpWithholding, com.tools20022.repository.codeset.WithholdingTaxRateType1Code.FATCATax,
						com.tools20022.repository.codeset.WithholdingTaxRateType1Code.NRATax);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BackUpWithholding.getCodeName().get(), BackUpWithholding);
		codesByName.put(FATCATax.getCodeName().get(), FATCATax);
		codesByName.put(NRATax.getCodeName().get(), NRATax);
	}

	public static WithholdingTaxRateType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WithholdingTaxRateType1Code[] values() {
		WithholdingTaxRateType1Code[] values = new WithholdingTaxRateType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WithholdingTaxRateType1Code> {
		@Override
		public WithholdingTaxRateType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WithholdingTaxRateType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}