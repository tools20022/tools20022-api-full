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
import com.tools20022.repository.codeset.ExecutionTimeLimit1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates from/until when an order must be executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#AtTheOpening
 * ExecutionTimeLimit1Code.AtTheOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#AtTheClosing
 * ExecutionTimeLimit1Code.AtTheClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#GoodForTheDay
 * ExecutionTimeLimit1Code.GoodForTheDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#GoodUntilCancelled
 * ExecutionTimeLimit1Code.GoodUntilCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#GoodThroughDate
 * ExecutionTimeLimit1Code.GoodThroughDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#GoodForTheMonth
 * ExecutionTimeLimit1Code.GoodForTheMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#FillOrKill
 * ExecutionTimeLimit1Code.FillOrKill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#GoodUntilTheEndOfNextMonth
 * ExecutionTimeLimit1Code.GoodUntilTheEndOfNextMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#GoodTillCrossed
 * ExecutionTimeLimit1Code.GoodTillCrossed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code#ImmediateOrCancel
 * ExecutionTimeLimit1Code.ImmediateOrCancel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimitCode
 * ExecutionTimeLimitCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22a::TILI</li>
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
 * "ExecutionTimeLimit1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates from/until when an order must be executed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExecutionTimeLimit1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtTheOpening"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code AtTheOpening = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtTheOpening";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.AtTheOpening.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtTheClosing"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code AtTheClosing = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtTheClosing";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.AtTheClosing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodForTheDay"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code GoodForTheDay = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodForTheDay";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.GoodForTheDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodUntilCancelled"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code GoodUntilCancelled = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodUntilCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.GoodUntilCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodThroughDate"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code GoodThroughDate = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodThroughDate";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.GoodThroughDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodForTheMonth"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code GoodForTheMonth = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodForTheMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.GoodForTheMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FillOrKill"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code FillOrKill = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FillOrKill";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.FillOrKill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodUntilTheEndOfNextMonth"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code GoodUntilTheEndOfNextMonth = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodUntilTheEndOfNextMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.GoodUntilTheEndOfNextMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodTillCrossed"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code GoodTillCrossed = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodTillCrossed";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.GoodTillCrossed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImmediateOrCancel"</li>
	 * </ul>
	 */
	public static final ExecutionTimeLimit1Code ImmediateOrCancel = new ExecutionTimeLimit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateOrCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.ExecutionTimeLimit1Code.mmObject();
			codeName = ExecutionTimeLimitCode.ImmediateOrCancel.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ExecutionTimeLimit1Code> codesByName = new LinkedHashMap<>();

	protected ExecutionTimeLimit1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TILI"));
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExecutionTimeLimit1Code";
				definition = "Indicates from/until when an order must be executed.";
				trace_lazy = () -> ExecutionTimeLimitCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExecutionTimeLimit1Code.AtTheOpening, com.tools20022.repository.codeset.ExecutionTimeLimit1Code.AtTheClosing,
						com.tools20022.repository.codeset.ExecutionTimeLimit1Code.GoodForTheDay, com.tools20022.repository.codeset.ExecutionTimeLimit1Code.GoodUntilCancelled,
						com.tools20022.repository.codeset.ExecutionTimeLimit1Code.GoodThroughDate, com.tools20022.repository.codeset.ExecutionTimeLimit1Code.GoodForTheMonth,
						com.tools20022.repository.codeset.ExecutionTimeLimit1Code.FillOrKill, com.tools20022.repository.codeset.ExecutionTimeLimit1Code.GoodUntilTheEndOfNextMonth,
						com.tools20022.repository.codeset.ExecutionTimeLimit1Code.GoodTillCrossed, com.tools20022.repository.codeset.ExecutionTimeLimit1Code.ImmediateOrCancel);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AtTheOpening.getCodeName().get(), AtTheOpening);
		codesByName.put(AtTheClosing.getCodeName().get(), AtTheClosing);
		codesByName.put(GoodForTheDay.getCodeName().get(), GoodForTheDay);
		codesByName.put(GoodUntilCancelled.getCodeName().get(), GoodUntilCancelled);
		codesByName.put(GoodThroughDate.getCodeName().get(), GoodThroughDate);
		codesByName.put(GoodForTheMonth.getCodeName().get(), GoodForTheMonth);
		codesByName.put(FillOrKill.getCodeName().get(), FillOrKill);
		codesByName.put(GoodUntilTheEndOfNextMonth.getCodeName().get(), GoodUntilTheEndOfNextMonth);
		codesByName.put(GoodTillCrossed.getCodeName().get(), GoodTillCrossed);
		codesByName.put(ImmediateOrCancel.getCodeName().get(), ImmediateOrCancel);
	}

	public static ExecutionTimeLimit1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExecutionTimeLimit1Code[] values() {
		ExecutionTimeLimit1Code[] values = new ExecutionTimeLimit1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExecutionTimeLimit1Code> {
		@Override
		public ExecutionTimeLimit1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExecutionTimeLimit1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}