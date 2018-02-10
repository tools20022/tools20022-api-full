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
import com.tools20022.repository.codeset.CashSettlementSystem1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the cash settlement system used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code#BankOfKoreaWire
 * CashSettlementSystem1Code.BankOfKoreaWire}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code#Cheque
 * CashSettlementSystem1Code.Cheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code#UKDomestic
 * CashSettlementSystem1Code.UKDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code#GrossSettlementSystem
 * CashSettlementSystem1Code.GrossSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code#NetSettlementSystem
 * CashSettlementSystem1Code.NetSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code#USChips
 * CashSettlementSystem1Code.USChips}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code#FedWireUS
 * CashSettlementSystem1Code.FedWireUS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
 * CashSettlementSystemCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BOKW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashSettlementSystem1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash settlement system used."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashSettlementSystem1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code
	 * CashSettlementSystem1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOfKoreaWire"</li>
	 * </ul>
	 */
	public static final CashSettlementSystem1Code BankOfKoreaWire = new CashSettlementSystem1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOfKoreaWire";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystem1Code.mmObject();
			codeName = CashSettlementSystemCode.BankOfKoreaWire.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code
	 * CashSettlementSystem1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * </ul>
	 */
	public static final CashSettlementSystem1Code Cheque = new CashSettlementSystem1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cheque";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystem1Code.mmObject();
			codeName = CashSettlementSystemCode.Cheque.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code
	 * CashSettlementSystem1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKDomestic"</li>
	 * </ul>
	 */
	public static final CashSettlementSystem1Code UKDomestic = new CashSettlementSystem1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomestic";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystem1Code.mmObject();
			codeName = CashSettlementSystemCode.UKDomestic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code
	 * CashSettlementSystem1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossSettlementSystem"</li>
	 * </ul>
	 */
	public static final CashSettlementSystem1Code GrossSettlementSystem = new CashSettlementSystem1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossSettlementSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystem1Code.mmObject();
			codeName = CashSettlementSystemCode.GrossSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code
	 * CashSettlementSystem1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSettlementSystem"</li>
	 * </ul>
	 */
	public static final CashSettlementSystem1Code NetSettlementSystem = new CashSettlementSystem1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSettlementSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystem1Code.mmObject();
			codeName = CashSettlementSystemCode.NetSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code
	 * CashSettlementSystem1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USChips"</li>
	 * </ul>
	 */
	public static final CashSettlementSystem1Code USChips = new CashSettlementSystem1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USChips";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystem1Code.mmObject();
			codeName = CashSettlementSystemCode.USChips.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem1Code
	 * CashSettlementSystem1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedWireUS"</li>
	 * </ul>
	 */
	public static final CashSettlementSystem1Code FedWireUS = new CashSettlementSystem1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedWireUS";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystem1Code.mmObject();
			codeName = CashSettlementSystemCode.FedWireUS.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CashSettlementSystem1Code> codesByName = new LinkedHashMap<>();

	protected CashSettlementSystem1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BOKW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSettlementSystem1Code";
				definition = "Specifies the cash settlement system used.";
				trace_lazy = () -> CashSettlementSystemCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashSettlementSystem1Code.BankOfKoreaWire, com.tools20022.repository.codeset.CashSettlementSystem1Code.Cheque,
						com.tools20022.repository.codeset.CashSettlementSystem1Code.UKDomestic, com.tools20022.repository.codeset.CashSettlementSystem1Code.GrossSettlementSystem,
						com.tools20022.repository.codeset.CashSettlementSystem1Code.NetSettlementSystem, com.tools20022.repository.codeset.CashSettlementSystem1Code.USChips,
						com.tools20022.repository.codeset.CashSettlementSystem1Code.FedWireUS);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BankOfKoreaWire.getCodeName().get(), BankOfKoreaWire);
		codesByName.put(Cheque.getCodeName().get(), Cheque);
		codesByName.put(UKDomestic.getCodeName().get(), UKDomestic);
		codesByName.put(GrossSettlementSystem.getCodeName().get(), GrossSettlementSystem);
		codesByName.put(NetSettlementSystem.getCodeName().get(), NetSettlementSystem);
		codesByName.put(USChips.getCodeName().get(), USChips);
		codesByName.put(FedWireUS.getCodeName().get(), FedWireUS);
	}

	public static CashSettlementSystem1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashSettlementSystem1Code[] values() {
		CashSettlementSystem1Code[] values = new CashSettlementSystem1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashSettlementSystem1Code> {
		@Override
		public CashSettlementSystem1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashSettlementSystem1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}