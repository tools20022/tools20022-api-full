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
import com.tools20022.repository.codeset.ReportSortedTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of criterion is a country.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportSortedTypeCode#Country
 * ReportSortedTypeCode.Country}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReportSortedTypeCode#Party
 * ReportSortedTypeCode.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportSortedTypeCode#Currency
 * ReportSortedTypeCode.Currency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReportSortedType1Code
 * ReportSortedType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportSortedTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of criterion is a country."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"COUN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReportSortedTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of criterion is a nation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportSortedTypeCode
	 * ReportSortedTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COUN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of criterion is a nation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final ReportSortedTypeCode Country = new ReportSortedTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Type of criterion is a nation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportSortedTypeCode.mmObject();
			codeName = "COUN";
		}
	};
	/**
	 * Type of criterion is an entity, eg, a financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportSortedTypeCode
	 * ReportSortedTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of criterion is an entity, eg, a financial institution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final ReportSortedTypeCode Party = new ReportSortedTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Party";
			definition = "Type of criterion is an entity, eg, a financial institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportSortedTypeCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Type of criterion is a currency, eg, the euro.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportSortedTypeCode
	 * ReportSortedTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of criterion is a currency, eg, the euro."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final ReportSortedTypeCode Currency = new ReportSortedTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Type of criterion is a currency, eg, the euro.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportSortedTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	final static private LinkedHashMap<String, ReportSortedTypeCode> codesByName = new LinkedHashMap<>();

	protected ReportSortedTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COUN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportSortedTypeCode";
				definition = "Type of criterion is a country.";
				derivation_lazy = () -> Arrays.asList(ReportSortedType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportSortedTypeCode.Country, com.tools20022.repository.codeset.ReportSortedTypeCode.Party, com.tools20022.repository.codeset.ReportSortedTypeCode.Currency);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Country.getCodeName().get(), Country);
		codesByName.put(Party.getCodeName().get(), Party);
		codesByName.put(Currency.getCodeName().get(), Currency);
	}

	public static ReportSortedTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReportSortedTypeCode[] values() {
		ReportSortedTypeCode[] values = new ReportSortedTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReportSortedTypeCode> {
		@Override
		public ReportSortedTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReportSortedTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}