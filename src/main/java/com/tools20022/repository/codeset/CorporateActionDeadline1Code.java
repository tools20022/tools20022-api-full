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
import com.tools20022.repository.codeset.CorporateActionDeadline1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the deadline reference of a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionDeadline1Code#MarketDeadline
 * CorporateActionDeadline1Code.MarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionDeadline1Code#ResponseDeadline
 * CorporateActionDeadline1Code.ResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionDeadline1Code#EarlyResponseDeadline
 * CorporateActionDeadline1Code.EarlyResponseDeadline}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReferenceDateCode
 * CorporateActionReferenceDateCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDeadline1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the deadline reference of a corporate action."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MKDT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionDeadline1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionDeadline1Code
	 * CorporateActionDeadline1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionDeadline1Code MarketDeadline = new CorporateActionDeadline1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadline";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionDeadline1Code.mmObject();
			codeName = CorporateActionReferenceDateCode.MarketDeadline.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionDeadline1Code
	 * CorporateActionDeadline1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionDeadline1Code ResponseDeadline = new CorporateActionDeadline1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDeadline";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionDeadline1Code.mmObject();
			codeName = CorporateActionReferenceDateCode.ResponseDeadline.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionDeadline1Code
	 * CorporateActionDeadline1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CorporateActionDeadline1Code EarlyResponseDeadline = new CorporateActionDeadline1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyResponseDeadline";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionDeadline1Code.mmObject();
			codeName = CorporateActionReferenceDateCode.EarlyResponseDeadline.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionDeadline1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionDeadline1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MKDT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDeadline1Code";
				definition = "Specifies the deadline reference of a corporate action.";
				trace_lazy = () -> CorporateActionReferenceDateCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionDeadline1Code.MarketDeadline, com.tools20022.repository.codeset.CorporateActionDeadline1Code.ResponseDeadline,
						com.tools20022.repository.codeset.CorporateActionDeadline1Code.EarlyResponseDeadline);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MarketDeadline.getCodeName().get(), MarketDeadline);
		codesByName.put(ResponseDeadline.getCodeName().get(), ResponseDeadline);
		codesByName.put(EarlyResponseDeadline.getCodeName().get(), EarlyResponseDeadline);
	}

	public static CorporateActionDeadline1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionDeadline1Code[] values() {
		CorporateActionDeadline1Code[] values = new CorporateActionDeadline1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionDeadline1Code> {
		@Override
		public CorporateActionDeadline1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionDeadline1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}