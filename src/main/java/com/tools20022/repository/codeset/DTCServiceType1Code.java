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
import com.tools20022.repository.codeset.DTCServiceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of DTC (The Depository Trust Company) service for example
 * Cash In Lieu/ Round Up, Foreign Tax Relief, etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCServiceType1Code#CashInLieuRoundUp
 * DTCServiceType1Code.CashInLieuRoundUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCServiceType1Code#USTaxWithholding
 * DTCServiceType1Code.USTaxWithholding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCServiceType1Code#ForeignTaxRelief
 * DTCServiceType1Code.ForeignTaxRelief}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCServiceType DTCServiceType}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CILR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCServiceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of DTC (The Depository Trust Company) service for example Cash In Lieu/ Round Up, Foreign Tax Relief, etc."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCServiceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCServiceType1Code
	 * DTCServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuRoundUp"</li>
	 * </ul>
	 */
	public static final DTCServiceType1Code CashInLieuRoundUp = new DTCServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuRoundUp";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCServiceType1Code.mmObject();
			codeName = DTCServiceType.CashInLieuRoundUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCServiceType1Code
	 * DTCServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTaxWithholding"</li>
	 * </ul>
	 */
	public static final DTCServiceType1Code USTaxWithholding = new DTCServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USTaxWithholding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCServiceType1Code.mmObject();
			codeName = DTCServiceType.USTaxWithholding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCServiceType1Code
	 * DTCServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxRelief"</li>
	 * </ul>
	 */
	public static final DTCServiceType1Code ForeignTaxRelief = new DTCServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxRelief";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCServiceType1Code.mmObject();
			codeName = DTCServiceType.ForeignTaxRelief.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCServiceType1Code> codesByName = new LinkedHashMap<>();

	protected DTCServiceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CILR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCServiceType1Code";
				definition = "Indicates the type of DTC (The Depository Trust Company) service for example Cash In Lieu/ Round Up, Foreign Tax Relief, etc.";
				trace_lazy = () -> DTCServiceType.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCServiceType1Code.CashInLieuRoundUp, com.tools20022.repository.codeset.DTCServiceType1Code.USTaxWithholding,
						com.tools20022.repository.codeset.DTCServiceType1Code.ForeignTaxRelief);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashInLieuRoundUp.getCodeName().get(), CashInLieuRoundUp);
		codesByName.put(USTaxWithholding.getCodeName().get(), USTaxWithholding);
		codesByName.put(ForeignTaxRelief.getCodeName().get(), ForeignTaxRelief);
	}

	public static DTCServiceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCServiceType1Code[] values() {
		DTCServiceType1Code[] values = new DTCServiceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCServiceType1Code> {
		@Override
		public DTCServiceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCServiceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}