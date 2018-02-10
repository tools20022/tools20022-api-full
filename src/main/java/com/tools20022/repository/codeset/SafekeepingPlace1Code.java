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
import com.tools20022.repository.codeset.SafekeepingPlace1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of place of safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace1Code#SharesHeldAtLocalCustodian
 * SafekeepingPlace1Code.SharesHeldAtLocalCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace1Code#SharesHeldAtICSD
 * SafekeepingPlace1Code.SharesHeldAtICSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace1Code#SharesHeldAtNCSD
 * SafekeepingPlace1Code.SharesHeldAtNCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace1Code#SharesHeldElsewhere
 * SafekeepingPlace1Code.SharesHeldElsewhere}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
 * SafekeepingPlaceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CUST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingPlace1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of place of safekeeping."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SafekeepingPlace1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace1Code
	 * SafekeepingPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesHeldAtLocalCustodian"</li>
	 * </ul>
	 */
	public static final SafekeepingPlace1Code SharesHeldAtLocalCustodian = new SafekeepingPlace1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesHeldAtLocalCustodian";
			owner_lazy = () -> com.tools20022.repository.codeset.SafekeepingPlace1Code.mmObject();
			codeName = SafekeepingPlaceCode.SharesHeldAtLocalCustodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace1Code
	 * SafekeepingPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesHeldAtICSD"</li>
	 * </ul>
	 */
	public static final SafekeepingPlace1Code SharesHeldAtICSD = new SafekeepingPlace1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesHeldAtICSD";
			owner_lazy = () -> com.tools20022.repository.codeset.SafekeepingPlace1Code.mmObject();
			codeName = SafekeepingPlaceCode.SharesHeldAtICSD.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace1Code
	 * SafekeepingPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesHeldAtNCSD"</li>
	 * </ul>
	 */
	public static final SafekeepingPlace1Code SharesHeldAtNCSD = new SafekeepingPlace1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesHeldAtNCSD";
			owner_lazy = () -> com.tools20022.repository.codeset.SafekeepingPlace1Code.mmObject();
			codeName = SafekeepingPlaceCode.SharesHeldAtNCSD.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace1Code
	 * SafekeepingPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesHeldElsewhere"</li>
	 * </ul>
	 */
	public static final SafekeepingPlace1Code SharesHeldElsewhere = new SafekeepingPlace1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesHeldElsewhere";
			owner_lazy = () -> com.tools20022.repository.codeset.SafekeepingPlace1Code.mmObject();
			codeName = SafekeepingPlaceCode.SharesHeldElsewhere.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SafekeepingPlace1Code> codesByName = new LinkedHashMap<>();

	protected SafekeepingPlace1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CUST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlace1Code";
				definition = "Specifies the type of place of safekeeping.";
				trace_lazy = () -> SafekeepingPlaceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SafekeepingPlace1Code.SharesHeldAtLocalCustodian, com.tools20022.repository.codeset.SafekeepingPlace1Code.SharesHeldAtICSD,
						com.tools20022.repository.codeset.SafekeepingPlace1Code.SharesHeldAtNCSD, com.tools20022.repository.codeset.SafekeepingPlace1Code.SharesHeldElsewhere);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SharesHeldAtLocalCustodian.getCodeName().get(), SharesHeldAtLocalCustodian);
		codesByName.put(SharesHeldAtICSD.getCodeName().get(), SharesHeldAtICSD);
		codesByName.put(SharesHeldAtNCSD.getCodeName().get(), SharesHeldAtNCSD);
		codesByName.put(SharesHeldElsewhere.getCodeName().get(), SharesHeldElsewhere);
	}

	public static SafekeepingPlace1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SafekeepingPlace1Code[] values() {
		SafekeepingPlace1Code[] values = new SafekeepingPlace1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SafekeepingPlace1Code> {
		@Override
		public SafekeepingPlace1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SafekeepingPlace1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}