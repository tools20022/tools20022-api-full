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
import com.tools20022.repository.codeset.CashClearingSystem2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of payment system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem2Code#RTGS
 * CashClearingSystem2Code.RTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem2Code#ACH
 * CashClearingSystem2Code.ACH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem2Code#USChips
 * CashClearingSystem2Code.USChips}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem2Code#FedNet
 * CashClearingSystem2Code.FedNet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
 * CashClearingSystemCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashClearingSystem2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of payment system."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RTG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashClearingSystem2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem2Code
	 * CashClearingSystem2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashClearingSystem2Code RTGS = new CashClearingSystem2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGS";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystem2Code.mmObject();
			codeName = CashClearingSystemCode.RTGS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem2Code
	 * CashClearingSystem2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ACH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashClearingSystem2Code ACH = new CashClearingSystem2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ACH";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystem2Code.mmObject();
			codeName = CashClearingSystemCode.ACH.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem2Code
	 * CashClearingSystem2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USChips"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashClearingSystem2Code USChips = new CashClearingSystem2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USChips";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystem2Code.mmObject();
			codeName = CashClearingSystemCode.USChips.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem2Code
	 * CashClearingSystem2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedNet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashClearingSystem2Code FedNet = new CashClearingSystem2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedNet";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystem2Code.mmObject();
			codeName = CashClearingSystemCode.FedNet.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CashClearingSystem2Code> codesByName = new LinkedHashMap<>();

	protected CashClearingSystem2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RTG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashClearingSystem2Code";
				definition = "Specifies a type of payment system.";
				trace_lazy = () -> CashClearingSystemCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashClearingSystem2Code.RTGS, com.tools20022.repository.codeset.CashClearingSystem2Code.ACH,
						com.tools20022.repository.codeset.CashClearingSystem2Code.USChips, com.tools20022.repository.codeset.CashClearingSystem2Code.FedNet);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RTGS.getCodeName().get(), RTGS);
		codesByName.put(ACH.getCodeName().get(), ACH);
		codesByName.put(USChips.getCodeName().get(), USChips);
		codesByName.put(FedNet.getCodeName().get(), FedNet);
	}

	public static CashClearingSystem2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashClearingSystem2Code[] values() {
		CashClearingSystem2Code[] values = new CashClearingSystem2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashClearingSystem2Code> {
		@Override
		public CashClearingSystem2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashClearingSystem2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}