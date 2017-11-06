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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the role of the broker in the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmTradingPrincipal
 * TradingCapacity1Code.mmTradingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmTradingAgent
 * TradingCapacity1Code.mmTradingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmCrossingPrincipal
 * TradingCapacity1Code.mmCrossingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmCrossingAgent
 * TradingCapacity1Code.mmCrossingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmOtherAgent
 * TradingCapacity1Code.mmOtherAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmBothAgent
 * TradingCapacity1Code.mmBothAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmPrincipalAgent
 * TradingCapacity1Code.mmPrincipalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmProprietary
 * TradingCapacity1Code.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmIndividual
 * TradingCapacity1Code.mmIndividual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#mmRisklessPrincipal
 * TradingCapacity1Code.mmRisklessPrincipal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "TradingCapacity1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of the broker in the transaction.\n"</li>
 * </ul>
 */
public class TradingCapacity1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Broker is buying or selling securities for its own account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Broker is buying or selling securities for its own account."</li>
	 * </ul>
	 */
	public static final MMCode mmTradingPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPrincipal";
			definition = "Broker is buying or selling securities for its own account.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "PRIN";
		}
	};
	/**
	 * Broker is trading on behalf of another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Broker is trading on behalf of another party."</li>
	 * </ul>
	 */
	public static final MMCode mmTradingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingAgent";
			definition = "Broker is trading on behalf of another party.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "TAGN";
		}
	};
	/**
	 * Broker is crossing as a principal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Broker is crossing as a principal."</li>
	 * </ul>
	 */
	public static final MMCode mmCrossingPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingPrincipal";
			definition = "Broker is crossing as a principal.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "CROP";
		}
	};
	/**
	 * Broker is crossing as an agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CROA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Broker is crossing as an agent."</li>
	 * </ul>
	 */
	public static final MMCode mmCrossingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingAgent";
			definition = "Broker is crossing as an agent.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "CROA";
		}
	};
	/**
	 * Broker is acting as an agent for an entity other than the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Broker is acting as an agent for an entity other than the customer."</li>
	 * </ul>
	 */
	public static final MMCode mmOtherAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAgent";
			definition = "Broker is acting as an agent for an entity other than the customer.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * Broker is acting as an agent for both the customer and another entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BothAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Broker is acting as an agent for both the customer and another entity."</li>
	 * </ul>
	 */
	public static final MMCode mmBothAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BothAgent";
			definition = "Broker is acting as an agent for both the customer and another entity.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "BAGN";
		}
	};
	/**
	 * Broker is acting as an agent in some executions and principal in other
	 * executions for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Broker is acting as an agent in some executions and principal in other executions for the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPrincipalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAgent";
			definition = "Broker is acting as an agent in some executions and principal in other executions for the transaction.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "PAGN";
		}
	};
	/**
	 * Broker is trading for its firm. The transactions affect the firm's
	 * account, but not the accounts of its clients.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Broker is trading for its firm. The transactions affect the firm's account, but not the accounts of its clients."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProprietary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Broker is trading for its firm. The transactions affect the firm's account, but not the accounts of its clients.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Broker trades as an individual.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Individual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Broker trades as an individual."</li>
	 * </ul>
	 */
	public static final MMCode mmIndividual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Individual";
			definition = "Broker trades as an individual.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "INDI";
		}
	};
	/**
	 * Broker trades as a riskless principal, ie, after receiving an order to
	 * buy (or sell) from a customer, the broker is offsetting the transaction
	 * by purchasing (or selling) the security from (or to) another entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code
	 * TradingCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RisklessPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Broker trades as a riskless principal, ie, after receiving an order to buy (or sell) from a customer, the broker is offsetting the transaction by purchasing (or selling) the security from (or to) another entity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRisklessPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RisklessPrincipal";
			definition = "Broker trades as a riskless principal, ie, after receiving an order to buy (or sell) from a customer, the broker is offsetting the transaction by purchasing (or selling) the security from (or to) another entity.";
			owner_lazy = () -> TradingCapacity1Code.mmObject();
			codeName = "RISP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("PRIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingCapacity1Code";
				definition = "Specifies the role of the broker in the transaction.\n";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingCapacity1Code.mmTradingPrincipal, com.tools20022.repository.codeset.TradingCapacity1Code.mmTradingAgent,
						com.tools20022.repository.codeset.TradingCapacity1Code.mmCrossingPrincipal, com.tools20022.repository.codeset.TradingCapacity1Code.mmCrossingAgent,
						com.tools20022.repository.codeset.TradingCapacity1Code.mmOtherAgent, com.tools20022.repository.codeset.TradingCapacity1Code.mmBothAgent, com.tools20022.repository.codeset.TradingCapacity1Code.mmPrincipalAgent,
						com.tools20022.repository.codeset.TradingCapacity1Code.mmProprietary, com.tools20022.repository.codeset.TradingCapacity1Code.mmIndividual, com.tools20022.repository.codeset.TradingCapacity1Code.mmRisklessPrincipal);
			}
		});
		return mmObject_lazy.get();
	}
}