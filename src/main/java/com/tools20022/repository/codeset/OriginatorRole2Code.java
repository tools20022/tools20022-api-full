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
import com.tools20022.repository.codeset.OriginatorRole2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of the trading party in the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code#SystematicInternaliser
 * OriginatorRole2Code.SystematicInternaliser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code#MultilateralTradingFacility
 * OriginatorRole2Code.MultilateralTradingFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code#RegulatedMarket
 * OriginatorRole2Code.RegulatedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code#MarketMaker
 * OriginatorRole2Code.MarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code#Investor
 * OriginatorRole2Code.Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code#TransfertAgent
 * OriginatorRole2Code.TransfertAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
 * OriginatorRoleCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SINT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginatorRole2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of the trading party in the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OriginatorRole2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code
	 * OriginatorRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInternaliser"</li>
	 * </ul>
	 */
	public static final OriginatorRole2Code SystematicInternaliser = new OriginatorRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystematicInternaliser";
			owner_lazy = () -> com.tools20022.repository.codeset.OriginatorRole2Code.mmObject();
			codeName = OriginatorRoleCode.SystematicInternaliser.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code
	 * OriginatorRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralTradingFacility"</li>
	 * </ul>
	 */
	public static final OriginatorRole2Code MultilateralTradingFacility = new OriginatorRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralTradingFacility";
			owner_lazy = () -> com.tools20022.repository.codeset.OriginatorRole2Code.mmObject();
			codeName = OriginatorRoleCode.MultilateralTradingFacility.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code
	 * OriginatorRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatedMarket"</li>
	 * </ul>
	 */
	public static final OriginatorRole2Code RegulatedMarket = new OriginatorRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatedMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.OriginatorRole2Code.mmObject();
			codeName = OriginatorRoleCode.RegulatedMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code
	 * OriginatorRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * </ul>
	 */
	public static final OriginatorRole2Code MarketMaker = new OriginatorRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMaker";
			owner_lazy = () -> com.tools20022.repository.codeset.OriginatorRole2Code.mmObject();
			codeName = OriginatorRoleCode.MarketMaker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code
	 * OriginatorRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * </ul>
	 */
	public static final OriginatorRole2Code Investor = new OriginatorRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			owner_lazy = () -> com.tools20022.repository.codeset.OriginatorRole2Code.mmObject();
			codeName = OriginatorRoleCode.Investor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRole2Code
	 * OriginatorRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransfertAgent"</li>
	 * </ul>
	 */
	public static final OriginatorRole2Code TransfertAgent = new OriginatorRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransfertAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.OriginatorRole2Code.mmObject();
			codeName = OriginatorRoleCode.TransfertAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OriginatorRole2Code> codesByName = new LinkedHashMap<>();

	protected OriginatorRole2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SINT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginatorRole2Code";
				definition = "Specifies the role of the trading party in the transaction.";
				trace_lazy = () -> OriginatorRoleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OriginatorRole2Code.SystematicInternaliser, com.tools20022.repository.codeset.OriginatorRole2Code.MultilateralTradingFacility,
						com.tools20022.repository.codeset.OriginatorRole2Code.RegulatedMarket, com.tools20022.repository.codeset.OriginatorRole2Code.MarketMaker, com.tools20022.repository.codeset.OriginatorRole2Code.Investor,
						com.tools20022.repository.codeset.OriginatorRole2Code.TransfertAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SystematicInternaliser.getCodeName().get(), SystematicInternaliser);
		codesByName.put(MultilateralTradingFacility.getCodeName().get(), MultilateralTradingFacility);
		codesByName.put(RegulatedMarket.getCodeName().get(), RegulatedMarket);
		codesByName.put(MarketMaker.getCodeName().get(), MarketMaker);
		codesByName.put(Investor.getCodeName().get(), Investor);
		codesByName.put(TransfertAgent.getCodeName().get(), TransfertAgent);
	}

	public static OriginatorRole2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OriginatorRole2Code[] values() {
		OriginatorRole2Code[] values = new OriginatorRole2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OriginatorRole2Code> {
		@Override
		public OriginatorRole2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OriginatorRole2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}