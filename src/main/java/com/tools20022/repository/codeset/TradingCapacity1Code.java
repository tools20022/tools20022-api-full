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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TradingCapacity1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of the broker in the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#TradingPrincipal
 * TradingCapacity1Code.TradingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#TradingAgent
 * TradingCapacity1Code.TradingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#CrossingPrincipal
 * TradingCapacity1Code.CrossingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#CrossingAgent
 * TradingCapacity1Code.CrossingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#OtherAgent
 * TradingCapacity1Code.OtherAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#BothAgent
 * TradingCapacity1Code.BothAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#PrincipalAgent
 * TradingCapacity1Code.PrincipalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#Proprietary
 * TradingCapacity1Code.Proprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#Individual
 * TradingCapacity1Code.Individual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity1Code#RisklessPrincipal
 * TradingCapacity1Code.RisklessPrincipal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::TRCA</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingCapacity1Code extends MMCode {

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
	public static final TradingCapacity1Code TradingPrincipal = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPrincipal";
			definition = "Broker is buying or selling securities for its own account.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
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
	public static final TradingCapacity1Code TradingAgent = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingAgent";
			definition = "Broker is trading on behalf of another party.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
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
	public static final TradingCapacity1Code CrossingPrincipal = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingPrincipal";
			definition = "Broker is crossing as a principal.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
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
	public static final TradingCapacity1Code CrossingAgent = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingAgent";
			definition = "Broker is crossing as an agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
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
	public static final TradingCapacity1Code OtherAgent = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAgent";
			definition = "Broker is acting as an agent for an entity other than the customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
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
	public static final TradingCapacity1Code BothAgent = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BothAgent";
			definition = "Broker is acting as an agent for both the customer and another entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
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
	public static final TradingCapacity1Code PrincipalAgent = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAgent";
			definition = "Broker is acting as an agent in some executions and principal in other executions for the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
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
	public static final TradingCapacity1Code Proprietary = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Broker is trading for its firm. The transactions affect the firm's account, but not the accounts of its clients.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
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
	public static final TradingCapacity1Code Individual = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Individual";
			definition = "Broker trades as an individual.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
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
	public static final TradingCapacity1Code RisklessPrincipal = new TradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RisklessPrincipal";
			definition = "Broker trades as a riskless principal, ie, after receiving an order to buy (or sell) from a customer, the broker is offsetting the transaction by purchasing (or selling) the security from (or to) another entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity1Code.mmObject();
			codeName = "RISP";
		}
	};
	final static private LinkedHashMap<String, TradingCapacity1Code> codesByName = new LinkedHashMap<>();

	protected TradingCapacity1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRCA"));
				example = Arrays.asList("PRIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingCapacity1Code";
				definition = "Specifies the role of the broker in the transaction.\n";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingCapacity1Code.TradingPrincipal, com.tools20022.repository.codeset.TradingCapacity1Code.TradingAgent,
						com.tools20022.repository.codeset.TradingCapacity1Code.CrossingPrincipal, com.tools20022.repository.codeset.TradingCapacity1Code.CrossingAgent, com.tools20022.repository.codeset.TradingCapacity1Code.OtherAgent,
						com.tools20022.repository.codeset.TradingCapacity1Code.BothAgent, com.tools20022.repository.codeset.TradingCapacity1Code.PrincipalAgent, com.tools20022.repository.codeset.TradingCapacity1Code.Proprietary,
						com.tools20022.repository.codeset.TradingCapacity1Code.Individual, com.tools20022.repository.codeset.TradingCapacity1Code.RisklessPrincipal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TradingPrincipal.getCodeName().get(), TradingPrincipal);
		codesByName.put(TradingAgent.getCodeName().get(), TradingAgent);
		codesByName.put(CrossingPrincipal.getCodeName().get(), CrossingPrincipal);
		codesByName.put(CrossingAgent.getCodeName().get(), CrossingAgent);
		codesByName.put(OtherAgent.getCodeName().get(), OtherAgent);
		codesByName.put(BothAgent.getCodeName().get(), BothAgent);
		codesByName.put(PrincipalAgent.getCodeName().get(), PrincipalAgent);
		codesByName.put(Proprietary.getCodeName().get(), Proprietary);
		codesByName.put(Individual.getCodeName().get(), Individual);
		codesByName.put(RisklessPrincipal.getCodeName().get(), RisklessPrincipal);
	}

	public static TradingCapacity1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingCapacity1Code[] values() {
		TradingCapacity1Code[] values = new TradingCapacity1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingCapacity1Code> {
		@Override
		public TradingCapacity1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingCapacity1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}