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
import com.tools20022.repository.codeset.TaxType12Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType12Code#InterimProfitTax
 * TaxType12Code.InterimProfitTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType12Code#EUTaxRetention
 * TaxType12Code.EUTaxRetention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType12Code#Aktiengewinn1
 * TaxType12Code.Aktiengewinn1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType12Code#Aktiengewinn2
 * TaxType12Code.Aktiengewinn2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType12Code#Zwischengewinn
 * TaxType12Code.Zwischengewinn}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType12Code#Mietgewinn
 * TaxType12Code.Mietgewinn}</li>
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
 * <li>"INPO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxType12Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of tax."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxType12Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType12Code
	 * TaxType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimProfitTax"</li>
	 * </ul>
	 */
	public static final TaxType12Code InterimProfitTax = new TaxType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimProfitTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType12Code.mmObject();
			codeName = TaxTypeCode.InterimProfitTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType12Code
	 * TaxType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUTaxRetention"</li>
	 * </ul>
	 */
	public static final TaxType12Code EUTaxRetention = new TaxType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUTaxRetention";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType12Code.mmObject();
			codeName = TaxTypeCode.EUTaxRetention.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType12Code
	 * TaxType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aktiengewinn1"</li>
	 * </ul>
	 */
	public static final TaxType12Code Aktiengewinn1 = new TaxType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aktiengewinn1";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType12Code.mmObject();
			codeName = TaxTypeCode.Aktiengewinn1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType12Code
	 * TaxType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aktiengewinn2"</li>
	 * </ul>
	 */
	public static final TaxType12Code Aktiengewinn2 = new TaxType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aktiengewinn2";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType12Code.mmObject();
			codeName = TaxTypeCode.Aktiengewinn2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType12Code
	 * TaxType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Zwischengewinn"</li>
	 * </ul>
	 */
	public static final TaxType12Code Zwischengewinn = new TaxType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Zwischengewinn";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType12Code.mmObject();
			codeName = TaxTypeCode.Zwischengewinn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType12Code
	 * TaxType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mietgewinn"</li>
	 * </ul>
	 */
	public static final TaxType12Code Mietgewinn = new TaxType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mietgewinn";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType12Code.mmObject();
			codeName = TaxTypeCode.Mietgewinn.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxType12Code> codesByName = new LinkedHashMap<>();

	protected TaxType12Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INPO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxType12Code";
				definition = "Specifies the type of tax.";
				trace_lazy = () -> TaxTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxType12Code.InterimProfitTax, com.tools20022.repository.codeset.TaxType12Code.EUTaxRetention,
						com.tools20022.repository.codeset.TaxType12Code.Aktiengewinn1, com.tools20022.repository.codeset.TaxType12Code.Aktiengewinn2, com.tools20022.repository.codeset.TaxType12Code.Zwischengewinn,
						com.tools20022.repository.codeset.TaxType12Code.Mietgewinn);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InterimProfitTax.getCodeName().get(), InterimProfitTax);
		codesByName.put(EUTaxRetention.getCodeName().get(), EUTaxRetention);
		codesByName.put(Aktiengewinn1.getCodeName().get(), Aktiengewinn1);
		codesByName.put(Aktiengewinn2.getCodeName().get(), Aktiengewinn2);
		codesByName.put(Zwischengewinn.getCodeName().get(), Zwischengewinn);
		codesByName.put(Mietgewinn.getCodeName().get(), Mietgewinn);
	}

	public static TaxType12Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxType12Code[] values() {
		TaxType12Code[] values = new TaxType12Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxType12Code> {
		@Override
		public TaxType12Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxType12Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}