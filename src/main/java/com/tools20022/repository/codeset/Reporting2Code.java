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
import com.tools20022.repository.codeset.Reporting2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies information with regards to reporting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reporting2Code#StockExchange
 * Reporting2Code.StockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reporting2Code#RegulatoryOrganisation
 * Reporting2Code.RegulatoryOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reporting2Code#DeferredReport
 * Reporting2Code.DeferredReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReportingCode ReportingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"STEX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reporting2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies information with regards to reporting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Reporting2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reporting2Code
	 * Reporting2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * </ul>
	 */
	public static final Reporting2Code StockExchange = new Reporting2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.Reporting2Code.mmObject();
			codeName = ReportingCode.StockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reporting2Code
	 * Reporting2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryOrganisation"</li>
	 * </ul>
	 */
	public static final Reporting2Code RegulatoryOrganisation = new Reporting2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryOrganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.Reporting2Code.mmObject();
			codeName = ReportingCode.RegulatoryOrganisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reporting2Code
	 * Reporting2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredReport"</li>
	 * </ul>
	 */
	public static final Reporting2Code DeferredReport = new Reporting2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredReport";
			owner_lazy = () -> com.tools20022.repository.codeset.Reporting2Code.mmObject();
			codeName = ReportingCode.DeferredReport.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Reporting2Code> codesByName = new LinkedHashMap<>();

	protected Reporting2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("STEX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reporting2Code";
				definition = "Specifies information with regards to reporting.";
				trace_lazy = () -> ReportingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Reporting2Code.StockExchange, com.tools20022.repository.codeset.Reporting2Code.RegulatoryOrganisation,
						com.tools20022.repository.codeset.Reporting2Code.DeferredReport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StockExchange.getCodeName().get(), StockExchange);
		codesByName.put(RegulatoryOrganisation.getCodeName().get(), RegulatoryOrganisation);
		codesByName.put(DeferredReport.getCodeName().get(), DeferredReport);
	}

	public static Reporting2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Reporting2Code[] values() {
		Reporting2Code[] values = new Reporting2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Reporting2Code> {
		@Override
		public Reporting2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Reporting2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}