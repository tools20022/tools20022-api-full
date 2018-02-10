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
import com.tools20022.repository.codeset.TaxType15Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of tax.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType15Code#Provincial
 * TaxType15Code.Provincial}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType15Code#NationalTax
 * TaxType15Code.NationalTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType15Code#StateTax
 * TaxType15Code.StateTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType15Code#WithholdingTax
 * TaxType15Code.WithholdingTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType15Code#StampDuty
 * TaxType15Code.StampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType15Code#ConsumptionTax
 * TaxType15Code.ConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType15Code#ValueAddedTax
 * TaxType15Code.ValueAddedTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType15Code#CustomsTax
 * TaxType15Code.CustomsTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType15Code#ValueAddedTaxOfZeroRate
 * TaxType15Code.ValueAddedTaxOfZeroRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PROV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxType15Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of tax."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxType15Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType15Code
	 * TaxType15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Provincial"</li>
	 * </ul>
	 */
	public static final TaxType15Code Provincial = new TaxType15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Provincial";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType15Code.mmObject();
			codeName = TaxTypeCode.Provincial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType15Code
	 * TaxType15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalTax"</li>
	 * </ul>
	 */
	public static final TaxType15Code NationalTax = new TaxType15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType15Code.mmObject();
			codeName = TaxTypeCode.NationalTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType15Code
	 * TaxType15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StateTax"</li>
	 * </ul>
	 */
	public static final TaxType15Code StateTax = new TaxType15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StateTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType15Code.mmObject();
			codeName = TaxTypeCode.StateTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType15Code
	 * TaxType15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * </ul>
	 */
	public static final TaxType15Code WithholdingTax = new TaxType15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType15Code.mmObject();
			codeName = TaxTypeCode.WithholdingTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType15Code
	 * TaxType15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * </ul>
	 */
	public static final TaxType15Code StampDuty = new TaxType15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType15Code.mmObject();
			codeName = TaxTypeCode.StampDuty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType15Code
	 * TaxType15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumptionTax"</li>
	 * </ul>
	 */
	public static final TaxType15Code ConsumptionTax = new TaxType15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType15Code.mmObject();
			codeName = TaxTypeCode.ConsumptionTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType15Code
	 * TaxType15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * </ul>
	 */
	public static final TaxType15Code ValueAddedTax = new TaxType15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType15Code.mmObject();
			codeName = TaxTypeCode.ValueAddedTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType15Code
	 * TaxType15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomsTax"</li>
	 * </ul>
	 */
	public static final TaxType15Code CustomsTax = new TaxType15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomsTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType15Code.mmObject();
			codeName = TaxTypeCode.CustomsTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType15Code
	 * TaxType15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxOfZeroRate"</li>
	 * </ul>
	 */
	public static final TaxType15Code ValueAddedTaxOfZeroRate = new TaxType15Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxOfZeroRate";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType15Code.mmObject();
			codeName = TaxTypeCode.ValueAddedTaxOfZeroRate.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxType15Code> codesByName = new LinkedHashMap<>();

	protected TaxType15Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PROV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxType15Code";
				definition = "Specifies the type of tax.";
				trace_lazy = () -> TaxTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxType15Code.Provincial, com.tools20022.repository.codeset.TaxType15Code.NationalTax, com.tools20022.repository.codeset.TaxType15Code.StateTax,
						com.tools20022.repository.codeset.TaxType15Code.WithholdingTax, com.tools20022.repository.codeset.TaxType15Code.StampDuty, com.tools20022.repository.codeset.TaxType15Code.ConsumptionTax,
						com.tools20022.repository.codeset.TaxType15Code.ValueAddedTax, com.tools20022.repository.codeset.TaxType15Code.CustomsTax, com.tools20022.repository.codeset.TaxType15Code.ValueAddedTaxOfZeroRate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Provincial.getCodeName().get(), Provincial);
		codesByName.put(NationalTax.getCodeName().get(), NationalTax);
		codesByName.put(StateTax.getCodeName().get(), StateTax);
		codesByName.put(WithholdingTax.getCodeName().get(), WithholdingTax);
		codesByName.put(StampDuty.getCodeName().get(), StampDuty);
		codesByName.put(ConsumptionTax.getCodeName().get(), ConsumptionTax);
		codesByName.put(ValueAddedTax.getCodeName().get(), ValueAddedTax);
		codesByName.put(CustomsTax.getCodeName().get(), CustomsTax);
		codesByName.put(ValueAddedTaxOfZeroRate.getCodeName().get(), ValueAddedTaxOfZeroRate);
	}

	public static TaxType15Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxType15Code[] values() {
		TaxType15Code[] values = new TaxType15Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxType15Code> {
		@Override
		public TaxType15Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxType15Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}