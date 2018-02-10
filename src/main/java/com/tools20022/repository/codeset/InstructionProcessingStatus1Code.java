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
import com.tools20022.repository.codeset.InstructionProcessingStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#Cancellation1
 * InstructionProcessingStatus1Code.Cancellation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#Cancellation2
 * InstructionProcessingStatus1Code.Cancellation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#Cancellation3
 * InstructionProcessingStatus1Code.Cancellation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#Cancelled
 * InstructionProcessingStatus1Code.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#CancelledByAnotherParty
 * InstructionProcessingStatus1Code.CancelledByAnotherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#PendingCancellation
 * InstructionProcessingStatus1Code.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#Generated
 * InstructionProcessingStatus1Code.Generated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#FullyExecutedConfirmationSent
 * InstructionProcessingStatus1Code.FullyExecutedConfirmationSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#CancellationRequested
 * InstructionProcessingStatus1Code.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#DefaultAction
 * InstructionProcessingStatus1Code.DefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#Done
 * InstructionProcessingStatus1Code.Done}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#PartiallyFilledOrder
 * InstructionProcessingStatus1Code.PartiallyFilledOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#ReceivedAtStockExchange
 * InstructionProcessingStatus1Code.ReceivedAtStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#FullyExecutedExecutionSent
 * InstructionProcessingStatus1Code.FullyExecutedExecutionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#ForcedRejection
 * InstructionProcessingStatus1Code.ForcedRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#Future
 * InstructionProcessingStatus1Code.Future}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#ReceivedAtIntermediary
 * InstructionProcessingStatus1Code.ReceivedAtIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#AlreadyMatchedAndAffirmed
 * InstructionProcessingStatus1Code.AlreadyMatchedAndAffirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#OpenOrder
 * InstructionProcessingStatus1Code.OpenOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#OverAllocated
 * InstructionProcessingStatus1Code.OverAllocated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#AcknowledgedAccepted
 * InstructionProcessingStatus1Code.AcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#PartialFill
 * InstructionProcessingStatus1Code.PartialFill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#PartialCancel
 * InstructionProcessingStatus1Code.PartialCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#PendingProcessing
 * InstructionProcessingStatus1Code.PendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#Rejected
 * InstructionProcessingStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#InRepair
 * InstructionProcessingStatus1Code.InRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#SettlementInstructionSent
 * InstructionProcessingStatus1Code.SettlementInstructionSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#StandingInstruction
 * InstructionProcessingStatus1Code.StandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#TradingSuspendedByStockExchange
 * InstructionProcessingStatus1Code.TradingSuspendedByStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#Treated
 * InstructionProcessingStatus1Code.Treated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#UnderAllocated
 * InstructionProcessingStatus1Code.UnderAllocated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code#ModificationRequested
 * InstructionProcessingStatus1Code.ModificationRequested}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
 * InstructionProcessingStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CAN1"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionProcessingStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionProcessingStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation1"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code Cancellation1 = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation1";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.Cancellation1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation2"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code Cancellation2 = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation2";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.Cancellation2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation3"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code Cancellation3 = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation3";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.Cancellation3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code Cancelled = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.Cancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAnotherParty"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code CancelledByAnotherParty = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAnotherParty";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.CancelledByAnotherParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code PendingCancellation = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.PendingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Generated"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code Generated = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.Generated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyExecutedConfirmationSent"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code FullyExecutedConfirmationSent = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyExecutedConfirmationSent";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.FullyExecutedConfirmationSent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequested"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code CancellationRequested = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.CancellationRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAction"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code DefaultAction = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.DefaultAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Done"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code Done = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Done";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.Done.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyFilledOrder"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code PartiallyFilledOrder = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyFilledOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.PartiallyFilledOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtStockExchange"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code ReceivedAtStockExchange = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.ReceivedAtStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyExecutedExecutionSent"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code FullyExecutedExecutionSent = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyExecutedExecutionSent";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.FullyExecutedExecutionSent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForcedRejection"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code ForcedRejection = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForcedRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.ForcedRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code Future = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.Future.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAtIntermediary"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code ReceivedAtIntermediary = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAtIntermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.ReceivedAtIntermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlreadyMatchedAndAffirmed"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code AlreadyMatchedAndAffirmed = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlreadyMatchedAndAffirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.AlreadyMatchedAndAffirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOrder"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code OpenOrder = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.OpenOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAllocated"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code OverAllocated = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverAllocated";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.OverAllocated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code AcknowledgedAccepted = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.AcknowledgedAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialFill"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code PartialFill = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFill";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.PartialFill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialCancel"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code PartialCancel = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.PartialCancel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code PendingProcessing = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.PendingProcessing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code Rejected = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code InRepair = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.InRepair.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionSent"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code SettlementInstructionSent = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionSent";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.SettlementInstructionSent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code StandingInstruction = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.StandingInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSuspendedByStockExchange"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code TradingSuspendedByStockExchange = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedByStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.TradingSuspendedByStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Treated"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code Treated = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treated";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.Treated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderAllocated"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code UnderAllocated = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderAllocated";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.UnderAllocated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatus1Code
	 * InstructionProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationRequested"</li>
	 * </ul>
	 */
	public static final InstructionProcessingStatus1Code ModificationRequested = new InstructionProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionProcessingStatus1Code.mmObject();
			codeName = InstructionProcessingStatusCode.ModificationRequested.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InstructionProcessingStatus1Code> codesByName = new LinkedHashMap<>();

	protected InstructionProcessingStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAN1");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionProcessingStatus1Code";
				definition = "Specifies the status of an instruction.";
				trace_lazy = () -> InstructionProcessingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionProcessingStatus1Code.Cancellation1, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.Cancellation2,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.Cancellation3, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.Cancelled,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.CancelledByAnotherParty, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.PendingCancellation,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.Generated, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.FullyExecutedConfirmationSent,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.CancellationRequested, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.DefaultAction,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.Done, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.PartiallyFilledOrder,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.ReceivedAtStockExchange, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.FullyExecutedExecutionSent,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.ForcedRejection, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.Future,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.ReceivedAtIntermediary, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.AlreadyMatchedAndAffirmed,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.OpenOrder, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.OverAllocated,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.AcknowledgedAccepted, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.PartialFill,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.PartialCancel, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.PendingProcessing,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.Rejected, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.InRepair,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.SettlementInstructionSent, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.StandingInstruction,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.TradingSuspendedByStockExchange, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.Treated,
						com.tools20022.repository.codeset.InstructionProcessingStatus1Code.UnderAllocated, com.tools20022.repository.codeset.InstructionProcessingStatus1Code.ModificationRequested);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cancellation1.getCodeName().get(), Cancellation1);
		codesByName.put(Cancellation2.getCodeName().get(), Cancellation2);
		codesByName.put(Cancellation3.getCodeName().get(), Cancellation3);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(CancelledByAnotherParty.getCodeName().get(), CancelledByAnotherParty);
		codesByName.put(PendingCancellation.getCodeName().get(), PendingCancellation);
		codesByName.put(Generated.getCodeName().get(), Generated);
		codesByName.put(FullyExecutedConfirmationSent.getCodeName().get(), FullyExecutedConfirmationSent);
		codesByName.put(CancellationRequested.getCodeName().get(), CancellationRequested);
		codesByName.put(DefaultAction.getCodeName().get(), DefaultAction);
		codesByName.put(Done.getCodeName().get(), Done);
		codesByName.put(PartiallyFilledOrder.getCodeName().get(), PartiallyFilledOrder);
		codesByName.put(ReceivedAtStockExchange.getCodeName().get(), ReceivedAtStockExchange);
		codesByName.put(FullyExecutedExecutionSent.getCodeName().get(), FullyExecutedExecutionSent);
		codesByName.put(ForcedRejection.getCodeName().get(), ForcedRejection);
		codesByName.put(Future.getCodeName().get(), Future);
		codesByName.put(ReceivedAtIntermediary.getCodeName().get(), ReceivedAtIntermediary);
		codesByName.put(AlreadyMatchedAndAffirmed.getCodeName().get(), AlreadyMatchedAndAffirmed);
		codesByName.put(OpenOrder.getCodeName().get(), OpenOrder);
		codesByName.put(OverAllocated.getCodeName().get(), OverAllocated);
		codesByName.put(AcknowledgedAccepted.getCodeName().get(), AcknowledgedAccepted);
		codesByName.put(PartialFill.getCodeName().get(), PartialFill);
		codesByName.put(PartialCancel.getCodeName().get(), PartialCancel);
		codesByName.put(PendingProcessing.getCodeName().get(), PendingProcessing);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(InRepair.getCodeName().get(), InRepair);
		codesByName.put(SettlementInstructionSent.getCodeName().get(), SettlementInstructionSent);
		codesByName.put(StandingInstruction.getCodeName().get(), StandingInstruction);
		codesByName.put(TradingSuspendedByStockExchange.getCodeName().get(), TradingSuspendedByStockExchange);
		codesByName.put(Treated.getCodeName().get(), Treated);
		codesByName.put(UnderAllocated.getCodeName().get(), UnderAllocated);
		codesByName.put(ModificationRequested.getCodeName().get(), ModificationRequested);
	}

	public static InstructionProcessingStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionProcessingStatus1Code[] values() {
		InstructionProcessingStatus1Code[] values = new InstructionProcessingStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionProcessingStatus1Code> {
		@Override
		public InstructionProcessingStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionProcessingStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}