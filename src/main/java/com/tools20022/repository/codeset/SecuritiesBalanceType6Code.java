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
import com.tools20022.repository.codeset.SecuritiesBalanceType6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of securities balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code#Available
 * SecuritiesBalanceType6Code.Available}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code#Restricted
 * SecuritiesBalanceType6Code.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code#TotalEntitled
 * SecuritiesBalanceType6Code.TotalEntitled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code#ReservedForDistribution
 * SecuritiesBalanceType6Code.ReservedForDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code#ReservedForRemoval
 * SecuritiesBalanceType6Code.ReservedForRemoval}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
 * BalanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AVLB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of securities balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceType6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code
	 * SecuritiesBalanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Available"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType6Code Available = new SecuritiesBalanceType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType6Code.mmObject();
			codeName = BalanceTypeCode.Available.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code
	 * SecuritiesBalanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType6Code Restricted = new SecuritiesBalanceType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType6Code.mmObject();
			codeName = BalanceTypeCode.Restricted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code
	 * SecuritiesBalanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEntitled"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType6Code TotalEntitled = new SecuritiesBalanceType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEntitled";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType6Code.mmObject();
			codeName = BalanceTypeCode.TotalEntitled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code
	 * SecuritiesBalanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservedForDistribution"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType6Code ReservedForDistribution = new SecuritiesBalanceType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReservedForDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType6Code.mmObject();
			codeName = BalanceTypeCode.ReservedForDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType6Code
	 * SecuritiesBalanceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservedForRemoval"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType6Code ReservedForRemoval = new SecuritiesBalanceType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReservedForRemoval";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType6Code.mmObject();
			codeName = BalanceTypeCode.ReservedForRemoval.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceType6Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceType6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AVLB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceType6Code";
				definition = "Specifies the type of securities balance.";
				trace_lazy = () -> BalanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceType6Code.Available, com.tools20022.repository.codeset.SecuritiesBalanceType6Code.Restricted,
						com.tools20022.repository.codeset.SecuritiesBalanceType6Code.TotalEntitled, com.tools20022.repository.codeset.SecuritiesBalanceType6Code.ReservedForDistribution,
						com.tools20022.repository.codeset.SecuritiesBalanceType6Code.ReservedForRemoval);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Available.getCodeName().get(), Available);
		codesByName.put(Restricted.getCodeName().get(), Restricted);
		codesByName.put(TotalEntitled.getCodeName().get(), TotalEntitled);
		codesByName.put(ReservedForDistribution.getCodeName().get(), ReservedForDistribution);
		codesByName.put(ReservedForRemoval.getCodeName().get(), ReservedForRemoval);
	}

	public static SecuritiesBalanceType6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceType6Code[] values() {
		SecuritiesBalanceType6Code[] values = new SecuritiesBalanceType6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceType6Code> {
		@Override
		public SecuritiesBalanceType6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceType6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}