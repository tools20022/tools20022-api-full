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
import com.tools20022.repository.codeset.TradeFinanceServiceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of bank service selected by the user.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeFinanceServiceCode#PurchaseOrderServices
 * TradeFinanceServiceCode.PurchaseOrderServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeFinanceServiceCode#Level1Services
 * TradeFinanceServiceCode.Level1Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeFinanceServiceCode#Level2Services
 * TradeFinanceServiceCode.Level2Services}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeFinanceServiceCode#Level3Services
 * TradeFinanceServiceCode.Level3Services}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeFinanceService2Code
 * TradeFinanceService2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PORS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeFinanceServiceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of bank service selected by the user."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeFinanceServiceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code for purchase order services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeFinanceServiceCode
	 * TradeFinanceServiceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PORS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrderServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for purchase order services."</li>
	 * </ul>
	 */
	public static final TradeFinanceServiceCode PurchaseOrderServices = new TradeFinanceServiceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderServices";
			definition = "Code for purchase order services.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeFinanceServiceCode.mmObject();
			codeName = "PORS";
		}
	};
	/**
	 * Code for level 1 services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeFinanceServiceCode
	 * TradeFinanceServiceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEV1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level1Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for level 1 services."</li>
	 * </ul>
	 */
	public static final TradeFinanceServiceCode Level1Services = new TradeFinanceServiceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level1Services";
			definition = "Code for level 1 services.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeFinanceServiceCode.mmObject();
			codeName = "LEV1";
		}
	};
	/**
	 * Code for level 2 services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeFinanceServiceCode
	 * TradeFinanceServiceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEV2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level2Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for level 2 services."</li>
	 * </ul>
	 */
	public static final TradeFinanceServiceCode Level2Services = new TradeFinanceServiceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level2Services";
			definition = "Code for level 2 services.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeFinanceServiceCode.mmObject();
			codeName = "LEV2";
		}
	};
	/**
	 * Code for level 3 services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeFinanceServiceCode
	 * TradeFinanceServiceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEV3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level3Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for level 3 services."</li>
	 * </ul>
	 */
	public static final TradeFinanceServiceCode Level3Services = new TradeFinanceServiceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level3Services";
			definition = "Code for level 3 services.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeFinanceServiceCode.mmObject();
			codeName = "LEV3";
		}
	};
	final static private LinkedHashMap<String, TradeFinanceServiceCode> codesByName = new LinkedHashMap<>();

	protected TradeFinanceServiceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PORS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeFinanceServiceCode";
				definition = "Specifies the type of bank service selected by the user.";
				derivation_lazy = () -> Arrays.asList(TradeFinanceService2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeFinanceServiceCode.PurchaseOrderServices, com.tools20022.repository.codeset.TradeFinanceServiceCode.Level1Services,
						com.tools20022.repository.codeset.TradeFinanceServiceCode.Level2Services, com.tools20022.repository.codeset.TradeFinanceServiceCode.Level3Services);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PurchaseOrderServices.getCodeName().get(), PurchaseOrderServices);
		codesByName.put(Level1Services.getCodeName().get(), Level1Services);
		codesByName.put(Level2Services.getCodeName().get(), Level2Services);
		codesByName.put(Level3Services.getCodeName().get(), Level3Services);
	}

	public static TradeFinanceServiceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeFinanceServiceCode[] values() {
		TradeFinanceServiceCode[] values = new TradeFinanceServiceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeFinanceServiceCode> {
		@Override
		public TradeFinanceServiceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeFinanceServiceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}