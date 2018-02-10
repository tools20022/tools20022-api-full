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
import com.tools20022.repository.codeset.TradingCapacity4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of a trading party in a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#Principal
 * TradingCapacity4Code.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#CrossingPrincipal
 * TradingCapacity4Code.CrossingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#RisklessPrincipal
 * TradingCapacity4Code.RisklessPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#Proprietary
 * TradingCapacity4Code.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#Agent
 * TradingCapacity4Code.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#CrossingAgent
 * TradingCapacity4Code.CrossingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#OtherAgent
 * TradingCapacity4Code.OtherAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#PrincipalAgent
 * TradingCapacity4Code.PrincipalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#ActingAgent
 * TradingCapacity4Code.ActingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#InvestmentFirm
 * TradingCapacity4Code.InvestmentFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#MarketMaker
 * TradingCapacity4Code.MarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#MultilateralTradingFacility
 * TradingCapacity4Code.MultilateralTradingFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#RegulatedMarket
 * TradingCapacity4Code.RegulatedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#SystematicInternaliser
 * TradingCapacity4Code.SystematicInternaliser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code#TransferAgent
 * TradingCapacity4Code.TransferAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
 * TradingCapacityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PRIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingCapacity4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of a trading party in a transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingCapacity4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code Principal = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.Principal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingPrincipal"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code CrossingPrincipal = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.CrossingPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RisklessPrincipal"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code RisklessPrincipal = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RisklessPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.RisklessPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code Proprietary = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.Proprietary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code Agent = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.Agent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code CrossingAgent = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.CrossingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code OtherAgent = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.OtherAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code PrincipalAgent = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.PrincipalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActingAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code ActingAgent = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.ActingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFirm"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code InvestmentFirm = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFirm";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.InvestmentFirm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code MarketMaker = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMaker";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.MarketMaker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralTradingFacility"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code MultilateralTradingFacility = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralTradingFacility";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.MultilateralTradingFacility.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatedMarket"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code RegulatedMarket = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatedMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.RegulatedMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInternaliser"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code SystematicInternaliser = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystematicInternaliser";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.SystematicInternaliser.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity4Code
	 * TradingCapacity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity4Code TransferAgent = new TradingCapacity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity4Code.mmObject();
			codeName = TradingCapacityCode.TransferAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradingCapacity4Code> codesByName = new LinkedHashMap<>();

	protected TradingCapacity4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingCapacity4Code";
				definition = "Specifies the role of a trading party in a transaction.";
				trace_lazy = () -> TradingCapacityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingCapacity4Code.Principal, com.tools20022.repository.codeset.TradingCapacity4Code.CrossingPrincipal,
						com.tools20022.repository.codeset.TradingCapacity4Code.RisklessPrincipal, com.tools20022.repository.codeset.TradingCapacity4Code.Proprietary, com.tools20022.repository.codeset.TradingCapacity4Code.Agent,
						com.tools20022.repository.codeset.TradingCapacity4Code.CrossingAgent, com.tools20022.repository.codeset.TradingCapacity4Code.OtherAgent, com.tools20022.repository.codeset.TradingCapacity4Code.PrincipalAgent,
						com.tools20022.repository.codeset.TradingCapacity4Code.ActingAgent, com.tools20022.repository.codeset.TradingCapacity4Code.InvestmentFirm, com.tools20022.repository.codeset.TradingCapacity4Code.MarketMaker,
						com.tools20022.repository.codeset.TradingCapacity4Code.MultilateralTradingFacility, com.tools20022.repository.codeset.TradingCapacity4Code.RegulatedMarket,
						com.tools20022.repository.codeset.TradingCapacity4Code.SystematicInternaliser, com.tools20022.repository.codeset.TradingCapacity4Code.TransferAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Principal.getCodeName().get(), Principal);
		codesByName.put(CrossingPrincipal.getCodeName().get(), CrossingPrincipal);
		codesByName.put(RisklessPrincipal.getCodeName().get(), RisklessPrincipal);
		codesByName.put(Proprietary.getCodeName().get(), Proprietary);
		codesByName.put(Agent.getCodeName().get(), Agent);
		codesByName.put(CrossingAgent.getCodeName().get(), CrossingAgent);
		codesByName.put(OtherAgent.getCodeName().get(), OtherAgent);
		codesByName.put(PrincipalAgent.getCodeName().get(), PrincipalAgent);
		codesByName.put(ActingAgent.getCodeName().get(), ActingAgent);
		codesByName.put(InvestmentFirm.getCodeName().get(), InvestmentFirm);
		codesByName.put(MarketMaker.getCodeName().get(), MarketMaker);
		codesByName.put(MultilateralTradingFacility.getCodeName().get(), MultilateralTradingFacility);
		codesByName.put(RegulatedMarket.getCodeName().get(), RegulatedMarket);
		codesByName.put(SystematicInternaliser.getCodeName().get(), SystematicInternaliser);
		codesByName.put(TransferAgent.getCodeName().get(), TransferAgent);
	}

	public static TradingCapacity4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingCapacity4Code[] values() {
		TradingCapacity4Code[] values = new TradingCapacity4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingCapacity4Code> {
		@Override
		public TradingCapacity4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingCapacity4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}