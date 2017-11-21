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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of criterion is a country.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportSortedTypeCode#mmCountry
 * ReportSortedTypeCode.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportSortedTypeCode#mmParty
 * ReportSortedTypeCode.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportSortedTypeCode#mmCurrency
 * ReportSortedTypeCode.mmCurrency}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportSortedTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of criterion is a country."</li>
 * </ul>
 */
public class ReportSortedTypeCode {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of criterion is a nation."</li>
	 * </ul>
	 */
	public static final MMCode mmCountry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Type of criterion is a nation.";
			owner_lazy = () -> ReportSortedTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of criterion is an entity, eg, a financial institution."</li>
	 * </ul>
	 */
	public static final MMCode mmParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Party";
			definition = "Type of criterion is an entity, eg, a financial institution.";
			owner_lazy = () -> ReportSortedTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of criterion is a currency, eg, the euro."</li>
	 * </ul>
	 */
	public static final MMCode mmCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Type of criterion is a currency, eg, the euro.";
			owner_lazy = () -> ReportSortedTypeCode.mmObject();
			codeName = "CURR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("COUN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportSortedTypeCode";
				definition = "Type of criterion is a country.";
				code_lazy = () -> Arrays.asList(ReportSortedTypeCode.mmCountry, ReportSortedTypeCode.mmParty, ReportSortedTypeCode.mmCurrency);
				derivation_lazy = () -> Arrays.asList(ReportSortedType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}