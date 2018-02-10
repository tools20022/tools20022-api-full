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
import com.tools20022.repository.codeset.PositionEffectV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the resulting position after a trade should be an opening
 * position or closing position.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code#OpenPosition
 * PositionEffectV2Code.OpenPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code#ClosePosition
 * PositionEffectV2Code.ClosePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code#Rolled
 * PositionEffectV2Code.Rolled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffectV2Code#Fifo
 * PositionEffectV2Code.Fifo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code#CloseAccount
 * PositionEffectV2Code.CloseAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffect2Code
 * PositionEffect2Code}</li>
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
 * <li>"OPEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PositionEffectV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the resulting position after a trade should be an opening position or closing position."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PositionEffectV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Position after the trade the position should be open.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code
	 * PositionEffectV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position after the trade the position should be open."</li>
	 * </ul>
	 */
	public static final PositionEffectV2Code OpenPosition = new PositionEffectV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpenPosition";
			definition = "Position after the trade the position should be open.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectV2Code.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Position after the trade the position should be closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code
	 * PositionEffectV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position after the trade the position should be closed."</li>
	 * </ul>
	 */
	public static final PositionEffectV2Code ClosePosition = new PositionEffectV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosePosition";
			definition = "Position after the trade the position should be closed.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectV2Code.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Results in a position obtained in a security previously held, sold and
	 * repurchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code
	 * PositionEffectV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rolled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Results in a position obtained in a security previously held, sold and repurchased."
	 * </li>
	 * </ul>
	 */
	public static final PositionEffectV2Code Rolled = new PositionEffectV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rolled";
			definition = "Results in a position obtained in a security previously held, sold and repurchased.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectV2Code.mmObject();
			codeName = "ROLL";
		}
	};
	/**
	 * First in, first out. Results in a position obtained after having sold in
	 * priority the securities bought chronologically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code
	 * PositionEffectV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fifo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First in, first out. Results in a position obtained after having sold in priority the securities bought chronologically."
	 * </li>
	 * </ul>
	 */
	public static final PositionEffectV2Code Fifo = new PositionEffectV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fifo";
			definition = "First in, first out. Results in a position obtained after having sold in priority the securities bought chronologically.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectV2Code.mmObject();
			codeName = "FIFO";
		}
	};
	/**
	 * Trade relates to a closure of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code
	 * PositionEffectV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade relates to a closure of an account."</li>
	 * </ul>
	 */
	public static final PositionEffectV2Code CloseAccount = new PositionEffectV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CloseAccount";
			definition = "Trade relates to a closure of an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectV2Code.mmObject();
			codeName = "CLOA";
		}
	};
	final static private LinkedHashMap<String, PositionEffectV2Code> codesByName = new LinkedHashMap<>();

	protected PositionEffectV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PositionEffectV2Code";
				definition = "Indicates whether the resulting position after a trade should be an opening position or closing position.";
				derivation_lazy = () -> Arrays.asList(PositionEffect2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PositionEffectV2Code.OpenPosition, com.tools20022.repository.codeset.PositionEffectV2Code.ClosePosition,
						com.tools20022.repository.codeset.PositionEffectV2Code.Rolled, com.tools20022.repository.codeset.PositionEffectV2Code.Fifo, com.tools20022.repository.codeset.PositionEffectV2Code.CloseAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OpenPosition.getCodeName().get(), OpenPosition);
		codesByName.put(ClosePosition.getCodeName().get(), ClosePosition);
		codesByName.put(Rolled.getCodeName().get(), Rolled);
		codesByName.put(Fifo.getCodeName().get(), Fifo);
		codesByName.put(CloseAccount.getCodeName().get(), CloseAccount);
	}

	public static PositionEffectV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PositionEffectV2Code[] values() {
		PositionEffectV2Code[] values = new PositionEffectV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PositionEffectV2Code> {
		@Override
		public PositionEffectV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PositionEffectV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}